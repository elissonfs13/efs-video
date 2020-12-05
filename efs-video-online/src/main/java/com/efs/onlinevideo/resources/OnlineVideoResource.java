package com.efs.onlinevideo.resources;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efs.onlinevideo.entities.OnlineVideo;
import com.efs.onlinevideo.feignclients.OfflineVideoFeignClient;


@RestController
@RequestMapping(value = "/onlinevideo")
public class OnlineVideoResource {
	
	private static Logger logger = LoggerFactory.getLogger(OnlineVideoResource.class);
	
	@Autowired
	private OfflineVideoFeignClient offlineVideoFeignClient;
	
	@GetMapping
	public ResponseEntity<List<OnlineVideo>> findAll() {
		List<OnlineVideo> list = new ArrayList<>();
		return ResponseEntity.ok(list);
	}	
	
	//@HystrixCommand(fallbackMethod = "postOnlineVideoAlternative")
	@PostMapping
	public ResponseEntity<OnlineVideo> postOnlineVideo(@RequestBody OnlineVideo onlineVideo) {
		logger.info("efs-video-online: " + onlineVideo.toString());
		ResponseEntity<OnlineVideo> resultFeign = offlineVideoFeignClient.postOnlineVideo(onlineVideo);
		
		logger.info("STATUS FEIGN CLIENT: " +resultFeign.getStatusCode());
		
		return ResponseEntity.ok(onlineVideo);
	}
	
	public ResponseEntity<OnlineVideo> postOnlineVideoAlternative(OnlineVideo onlineVideo) {
		logger.info("efs-video-online: ALTERNATIVE: " + onlineVideo.toString());
		return ResponseEntity.noContent().build();
	}

}
