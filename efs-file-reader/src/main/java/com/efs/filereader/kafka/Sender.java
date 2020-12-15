package com.efs.filereader.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.efs.filereader.entities.AvroVideo;

@Component
public class Sender {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);
	
	@Value("${kafka.topic.avro}")
    private String avroVideoTopic;
 
	@Autowired
	private KafkaTemplate<String, AvroVideo> kafkaTemplate;

	public void send(AvroVideo avroVideo) {
		LOGGER.info("efs-file-reader: sending video = " + avroVideo.toString());
		kafkaTemplate.send(avroVideoTopic, avroVideo);
	}
	

}
