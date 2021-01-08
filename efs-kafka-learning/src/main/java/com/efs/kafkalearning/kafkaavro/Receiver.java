package com.efs.kafkalearning.kafkaavro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.efs.kafkalearning.entities.AvroVideo;
import com.efs.kafkalearning.services.VideoDownloadedServices;

public class Receiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);
	
	
	@Autowired
	private VideoDownloadedServices videoDownloadedServices;

  	@KafkaListener(topics = "${kafka.topic.avro}")
  	public void receive(AvroVideo video) {
	    LOGGER.info("efs-kafka-learning: AVRO VIDEO CONSUMED = " + video.toString());
	    videoDownloadedServices.sendVideoDownloaded(video);
  	}
}
