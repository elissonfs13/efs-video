package com.efs.filereader.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efs.filereader.entities.AvroVideo;
import com.efs.filereader.entities.SparkVideo;
import com.efs.filereader.kafka.Sender;

@Service
public class KafkaAvroService {
	
	@Autowired
	private Sender sender;
	
	public void sendToKafkaAvro(List<SparkVideo> videos) {
		
		for (SparkVideo video : videos) {
			sender.send(convertVideo(video));
		}
	}
	
	private AvroVideo convertVideo(SparkVideo sparkVideo) {
		return new AvroVideo(
				sparkVideo.getIdentifier(), 
				sparkVideo.getName(), 
				sparkVideo.getUrl(), 
				sparkVideo.getDescription(),
				sparkVideo.getDuration(),
				sparkVideo.getCategory(),
				sparkVideo.getIdOnlineVideo(),
				sparkVideo.getLocalPath(), 
				sparkVideo.getSize()
		);
	}

}
