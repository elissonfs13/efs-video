package com.efs.offlinevideo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efs.offlinevideo.entities.OnlineVideo;
import com.efs.offlinevideo.producers.DownloadProducer;

@Service
public class OfflineVideoService {
	
	private static Logger logger = LoggerFactory.getLogger(OfflineVideoService.class);
	
	@Autowired
	private DownloadProducer downloadProducer;
	
	public void sendVideoToDownload(final OnlineVideo onlineVideo) {
		
		downloadProducer.send(onlineVideo.getUrlSite());
		logger.info("efs-video-offline: SEND TO DOWNLOAD TOPIC; " + onlineVideo.getUrlSite());
		
	}

}
