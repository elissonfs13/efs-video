package com.efs.offlinevideo.producers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class DownloadProducer {
	
	@Value("${downloadvideo.topic}")
    private String downloadTopic;
 
	private final KafkaTemplate kafkaTemplate;
 
	public DownloadProducer(final KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
 
    public void send(final @RequestBody String downloadUrl) {
        final String mensageKey = UUID.randomUUID().toString();
        kafkaTemplate.send(downloadTopic, mensageKey, downloadUrl);
    }

}
