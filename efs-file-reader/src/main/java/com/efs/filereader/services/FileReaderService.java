package com.efs.filereader.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.efs.filereader.feignclients.OfflineVideoFeignClient;


@Service
public class FileReaderService {
	
	private static Logger logger = LoggerFactory.getLogger(FileReaderService.class);
	
	@Autowired
	private OfflineVideoFeignClient offlineVideoFeignClient;
	
	public void executeSpark() {
		
		String logFile = "spark.csv";
		
		SparkConf conf = new SparkConf().setAppName("EFS-FILE-READER").setMaster("local[*]");
        JavaSparkContext sc = new JavaSparkContext(conf);
		
        JavaRDD<String> logData = sc.textFile(logFile).cache();
        sendUrlsToOfflineVideo(logData);
		
	}
	
	public void sendUrlsToOfflineVideo(JavaRDD<String> logData) {
		
		List<String> urlsVideos = findUrls(logData);
		ResponseEntity<Void> resultFeign = offlineVideoFeignClient.postVideoUrls(urlsVideos);
		
		logger.info("efs-file-reader: STATUS FEIGN CLIENT: " + resultFeign.getStatusCode());
		
	}
	
	private List<String> findUrls(JavaRDD<String> logData) {
		List<String> urls = new ArrayList<>();
		for (String url : logData.collect()) {
        	if (url.endsWith(",")) {
        		url = url.substring(0, url.length() - 1);
        	}
        	logger.info("efs-file-reader: URL in file: " + url);
        	urls.add(url);
        }
		return urls;
	}

}
