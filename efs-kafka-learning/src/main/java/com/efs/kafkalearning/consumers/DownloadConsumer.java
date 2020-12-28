package com.efs.kafkalearning.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DownloadConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DownloadConsumer.class);
	
	@KafkaListener(topics = "${downloadvideo.topic}", containerFactory = "kafkaListenerContainerStrFactory")
    public void consumer(String download) {
		LOGGER.info("efs-kafka-learning: STRING CONSUMED: " + download);
    }

}
