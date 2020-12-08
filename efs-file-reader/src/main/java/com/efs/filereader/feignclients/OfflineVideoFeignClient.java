package com.efs.filereader.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "efs-video-offline", path = "/offlinevideo")
public interface OfflineVideoFeignClient {
	
	@PostMapping(value = "/urls")
	ResponseEntity<Void> postVideoUrls(@RequestBody List<String> urlsVideos);

}
