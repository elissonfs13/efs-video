package com.efs.onlinevideo.resources;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.efs.onlinevideo.entities.OnlineVideo;
import com.efs.onlinevideo.entities.VideoDownloaded;
import com.efs.onlinevideo.services.OnlineVideosService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
@RequestMapping(value = "/onlinevideo")
public class OnlineVideoResource {
	
	private static Logger logger = LoggerFactory.getLogger(OnlineVideoResource.class);
	
	@Autowired
	private OnlineVideosService onlineVideosService;
	
	@GetMapping
	public ResponseEntity<List<OnlineVideo>> findAll() {
		List<OnlineVideo> listOnlineVideo = onlineVideosService.findAll();
		return ResponseEntity.ok(listOnlineVideo);
	}	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OnlineVideo> findById(@PathVariable String id) {
		Optional<OnlineVideo> onlineVideo = onlineVideosService.findById(id);
		if (onlineVideo.isPresent()) {
			return ResponseEntity.ok(onlineVideo.get());
		}
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<List<OnlineVideo>> findByCategory(@RequestParam String category) {
		List<OnlineVideo> listOnlineVideo = onlineVideosService.findByCategory(category);
		return ResponseEntity.ok(listOnlineVideo);
	}
	
	@PostMapping
	@HystrixCommand(fallbackMethod = "saveOnlineVideoAlternative")
	public ResponseEntity<OnlineVideo> saveOnlineVideo(@RequestBody OnlineVideo onlineVideo) {
		logger.info("efs-video-online: RECEIVED: " + onlineVideo.toString());
		
		OnlineVideo onlineVideoSaved = onlineVideosService.saveOnlineVideo(onlineVideo);
		
		logger.info("efs-video-online: SAVED: " + onlineVideoSaved.toString());
		
		return ResponseEntity.ok(onlineVideoSaved);
	}
	
	public ResponseEntity<OnlineVideo> saveOnlineVideoAlternative(OnlineVideo onlineVideo) {
		logger.info("efs-video-online: ALTERNATIVE: " + onlineVideo.toString());
		
		OnlineVideo onlineVideoSaved = onlineVideosService.saveOnlineVideoAlternative(onlineVideo);
		return ResponseEntity.ok(onlineVideoSaved);
	}
	
	@PostMapping(value = "/info")
	public ResponseEntity<Void> receiveVideoDowloaded(@RequestBody final VideoDownloaded video) {
		logger.info("efs-video-online: VIDEO DOWNLOADED: " + video.toString());
		return ResponseEntity.ok().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<OnlineVideo> saveOnlineVideo(@RequestBody OnlineVideo onlineVideo, @PathVariable String id) {
		logger.info("efs-video-online: RECEIVED: " + onlineVideo.toString());
		
		OnlineVideo onlineVideoUpdated = onlineVideosService.updateOnlineVideo(onlineVideo, id);
		
		logger.info("efs-video-online: UPDATED: " + onlineVideoUpdated.toString());
		
		return ResponseEntity.ok(onlineVideoUpdated);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteOnlineVideo( @PathVariable String id) {
		onlineVideosService.deleteOnlineVideo(id);
		return ResponseEntity.ok().build();
	}

}
