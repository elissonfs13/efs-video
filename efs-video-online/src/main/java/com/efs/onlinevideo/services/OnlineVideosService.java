package com.efs.onlinevideo.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.efs.onlinevideo.entities.OnlineVideo;
import com.efs.onlinevideo.feignclients.OfflineVideoFeignClient;
import com.efs.onlinevideo.repository.OnlineVideoRepository;

@Service
public class OnlineVideosService {
	
	private static Logger logger = LoggerFactory.getLogger(OnlineVideosService.class);
	
	@Autowired
	private OnlineVideoRepository onlineVideoRepository;
	
	@Autowired
	private OfflineVideoFeignClient offlineVideoFeignClient;
	
	public List<OnlineVideo> findAll() {
		return onlineVideoRepository.findAll();
	}
	
	public Optional<OnlineVideo> findById(String id) {
		return onlineVideoRepository.findById(id);
	}

	public List<OnlineVideo> findByCategory(String categoria) {
		return onlineVideoRepository.findByCategoria(categoria);
	}
	
	public OnlineVideo saveOnlineVideo(OnlineVideo onlineVideo) {
		OnlineVideo onlineVideoSaved = onlineVideoRepository.save(onlineVideo);
		
		ResponseEntity<OnlineVideo> resultFeign = offlineVideoFeignClient.postOnlineVideo(onlineVideoSaved);
		logger.info("STATUS FEIGN CLIENT: " + resultFeign.getStatusCode());
		
		return onlineVideoSaved;
	}
	
	public OnlineVideo saveOnlineVideoAlternative(OnlineVideo onlineVideo) {	
		return onlineVideoRepository.save(onlineVideo);
	}
	
	public OnlineVideo updateOnlineVideo(OnlineVideo onlineVideo, String id) {
		onlineVideo.setId(id);
		onlineVideoRepository.save(onlineVideo);
		return onlineVideo;
	}
	
	public void deleteOnlineVideo(String id) {
		Optional<OnlineVideo> onlineVideo = findById(id);
		
		if (onlineVideo.isPresent()) {
			onlineVideoRepository.deleteById(id);
			logger.info("efs-video-online: DELETED: " + onlineVideo.get().toString());
		}
	}

}
