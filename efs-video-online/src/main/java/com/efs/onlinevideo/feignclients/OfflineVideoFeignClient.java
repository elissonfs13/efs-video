package com.efs.onlinevideo.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.efs.onlinevideo.entities.OnlineVideo;



@Component
@FeignClient(name = "efs-video-offline", path = "/offlinevideo")
public interface OfflineVideoFeignClient {
	
	@PostMapping
	ResponseEntity<OnlineVideo> postOnlineVideo(@RequestBody OnlineVideo onlineVideo);

}
