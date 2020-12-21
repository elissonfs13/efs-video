package com.efs.webflux.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.http.CacheControl;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.efs.webflux.services.VideoService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class VideoRouteHandler {
	
	@Autowired
	private VideoService videoService;
	
	public Mono<ServerResponse> getVideoByName(ServerRequest request) {

        String fileName = request.pathVariable("name");

        Mono<UrlResource> videoResourceMono = videoService.getResourceByName(fileName);
        
        log.info("efs-video-webflux: Streaming video: " + fileName);

        return videoResourceMono
                .flatMap(urlResource -> {
                    long contentLength = videoService.lengthOf(urlResource);
                    return ServerResponse
                            .ok()
                            .contentLength(contentLength)
                            .headers(httpHeaders -> httpHeaders.setCacheControl(CacheControl.noCache()))
                            .body(videoResourceMono, UrlResource.class);
                });

    }

}
