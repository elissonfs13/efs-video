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
	public ResponseEntity<OnlineVideo> postOnlineVideo(@RequestBody final OnlineVideo onlineVideo) {
		logger.info("efs-video-offline: " + onlineVideo.toString());
		
		offlineVideoService.sendVideoToDownload(onlineVideo);
		return ResponseEntity.ok().build();
	}

}
