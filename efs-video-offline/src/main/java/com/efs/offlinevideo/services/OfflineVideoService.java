package com.efs.offlinevideo.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efs.offlinevideo.entities.OnlineVideo;
import com.efs.offlinevideo.producers.DownloadProducer;
import com.efs.offlinevideo.utils.FileUtils;

@Service
public class OfflineVideoService {
	
	private static Logger logger = LoggerFactory.getLogger(OfflineVideoService.class);
	
	@Autowired
	private DownloadProducer downloadProducer;
	
	@Autowired
	private FileUtils fu;
	
	public void sendVideoToDownload(final String urlVideo) {
		
		downloadProducer.send(urlVideo);
		logger.info("efs-video-offline: SEND TO DOWNLOAD TOPIC: " + urlVideo);
		
	}
	
	public void sendVideosToDownload(List<String> urlVideos) {
		
		for (String urlVideo : urlVideos) {
			sendVideoToDownload(urlVideo);
		}
		
	}
	
	public void writeInfoVideoInCsvFile(OnlineVideo video) {
		
		fu.writeVideo(video);
		logger.info("efs-video-offline: WRITE INFO VIDEO IN CSV FILE: " + video.toString());
		
	}

}
