package com.efs.offlinevideo.resources;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efs.offlinevideo.entities.OnlineVideo;
import com.efs.offlinevideo.entities.VideoDownloaded;
import com.efs.offlinevideo.services.OfflineVideoService;

@RefreshScope
@RestController
@RequestMapping(value = "/offlinevideo")
public class OfflineVideoResource {
	
	private static Logger logger = LoggerFactory.getLogger(OfflineVideoResource.class);
	
	@Autowired
	private OfflineVideoService offlineVideoService;
	
	@GetMapping
	public ResponseEntity<List<OnlineVideo>> findAll() {
		List<OnlineVideo> list = new ArrayList<>();
		return ResponseEntity.ok(list);
	}	
	
	@PostMapping
	public ResponseEntity<Void> postOnlineVideo(@RequestBody final OnlineVideo onlineVideo) {
		logger.info("efs-video-offline: " + onlineVideo.toString());
		
		offlineVideoService.writeInfoVideoInCsvFile(onlineVideo);
		offlineVideoService.sendVideoToDownload(onlineVideo.getUrlSite());
		return ResponseEntity.ok().build();
	}
	
	@PostMapping(value = "/urls")
	public ResponseEntity<Void> postVideoUrls(@RequestBody final List<String> urlVideos) {
		logger.info("efs-video-offline: " + urlVideos.size() + " urls to download");
		
		offlineVideoService.sendVideosToDownload(urlVideos);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping(value = "/info")
	public ResponseEntity<Void> receiveVideoDowloaded(@RequestBody final VideoDownloaded video) {
		logger.info("efs-video-offline: VIDEO DOWNLOADED: " + video.toString());
		return ResponseEntity.ok().build();
	}

}
