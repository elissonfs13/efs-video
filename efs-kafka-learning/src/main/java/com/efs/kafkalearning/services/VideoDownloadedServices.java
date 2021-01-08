package com.efs.kafkalearning.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efs.kafkalearning.entities.AvroVideo;
import com.efs.kafkalearning.entities.VideoDownloaded;
import com.efs.kafkalearning.feignclients.OnlineVideoFeignClient;

@Service
public class VideoDownloadedServices {
	
	private static Logger logger = LoggerFactory.getLogger(VideoDownloadedServices.class);
	
	@Autowired
	private OnlineVideoFeignClient onlineVideoFeignClient;
	
	public void sendVideoDownloaded(AvroVideo avroVideo) {
		VideoDownloaded videoDownloaded = getVideoDownloadedByAvroVideo(avroVideo);
		onlineVideoFeignClient.postVideoDownloaded(videoDownloaded);
		logger.info("efs-kafka-learning: VIDEO DOWNLOADED SEND TO VIDEO ONLINE MICROSERVICE = " + videoDownloaded.toString());
	}
	
	private VideoDownloaded getVideoDownloadedByAvroVideo(AvroVideo avroVideo) {
		return new VideoDownloaded(
			avroVideo.getIdentifier().toString(),
			avroVideo.getIdOnlineVideo().toString(),
			avroVideo.getName().toString(),
			avroVideo.getUrl().toString(),
			avroVideo.getSize().toString()
		);
	}

}
