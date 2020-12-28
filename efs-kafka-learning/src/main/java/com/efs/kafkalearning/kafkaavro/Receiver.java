package com.efs.kafkalearning.kafkaavro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import com.efs.kafkalearning.entities.AvroVideo;

public class Receiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

  	@KafkaListener(topics = "${kafka.topic.avro}")
  	public void receive(AvroVideo video) {
	    LOGGER.info("efs-kafka-learning: AVRO VIDEO CONSUMED = " + video.toString());
  	}
}
