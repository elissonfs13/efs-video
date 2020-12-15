package com.efs.filereader.services;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.efs.filereader.entities.SparkVideo;
import com.efs.filereader.feignclients.OfflineVideoFeignClient;
import com.efs.filereader.kafka.Sender;


@Service
public class FileReaderService {
	
	private static Logger logger = LoggerFactory.getLogger(FileReaderService.class);
	
	@Value("${spark.url-file}")
    private String urlFile;
	
	@Value("${spark.video_online}")
    private String videoOnlineFile;
	
	@Value("${spark.video_offline}")
    private String videoOfflineFile;
	
	@Autowired
    private JavaSparkContext context;
	
	@Autowired
	private SparkSession session;
	
	@Autowired
	private KafkaAvroService kafkaAvroService;
	
	@Autowired
	private OfflineVideoFeignClient offlineVideoFeignClient;
	
	public void readFileWithSpark() {
		
        JavaRDD<String> logData = context.textFile(urlFile).cache();
        sendUrlsToOfflineVideo(logData);
		
	}
	
	public void joinFilesWithSpark() {
		
		Dataset<Row> dsRowVideo = getJoinDataSet();
		List<SparkVideo> videos = convertDataSetToVideo(dsRowVideo);
		
		logger.info("efs-file-reader: Number of videos converted: " + videos.size());
		videos.stream().forEach(video -> logger.info("efs-file-reader: VIDEO CONVERTED: " + video.toString()));
		
		kafkaAvroService.sendToKafkaAvro(videos);
	}
	
	private Dataset<Row> getJoinDataSet() {
		
		Dataset<Row> dsVideoOnline = session.read().format("csv").option("header", "true").load(videoOnlineFile);
		Dataset<Row> dsVideoOffline = session.read().format("csv").option("header", "true").load(videoOfflineFile);
		
		Dataset<Row> dsVideo = dsVideoOffline.distinct().join(dsVideoOnline.distinct(), "identifier").orderBy("title");
		dsVideo.show();		
		
		return dsVideo;
	}
	
	private List<SparkVideo> convertDataSetToVideo(Dataset<Row> dsRowVideo) {
		
		Dataset<SparkVideo> dsVideo = dsRowVideo.map((MapFunction<Row, SparkVideo>)row -> {
			SparkVideo video = new SparkVideo();
			video.setName(row.getAs("title"));
			video.setIdentifier(row.getAs("identifier"));
			video.setLocalPath(row.getAs("path"));
			video.setUrl(row.getAs("url"));
			return video;
		}, Encoders.bean(SparkVideo.class));
		
		return dsVideo.collectAsList();
	}
	
	private void sendUrlsToOfflineVideo(JavaRDD<String> logData) {
		
		List<String> urlsVideos = logData.collect().stream()
				.map(url -> getUrlWithoutEndComma(url))
				.collect(Collectors.toList());
		
		ResponseEntity<Void> resultFeign = offlineVideoFeignClient.postVideoUrls(urlsVideos);
		
		logger.info("efs-file-reader: STATUS FEIGN CLIENT: " + resultFeign.getStatusCode());
	}
	
	private String getUrlWithoutEndComma(String url) {
		
		logger.info("efs-file-reader: URL in file: " + url);
		return url.endsWith(",") ? url.substring(0, url.length() - 1) : url;
	}

}
