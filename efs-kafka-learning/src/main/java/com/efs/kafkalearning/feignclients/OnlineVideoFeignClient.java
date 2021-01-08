package com.efs.kafkalearning.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.efs.kafkalearning.entities.VideoDownloaded;

@Component
@FeignClient(name = "efs-video-online", path = "/onlinevideo/info")
public interface OnlineVideoFeignClient {
	
	@PostMapping
	ResponseEntity<Void> postVideoDownloaded(@RequestBody VideoDownloaded video);

}
