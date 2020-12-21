package com.efs.webflux.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import com.efs.webflux.entities.Video;
import com.efs.webflux.repositories.VideoRepository;

import reactor.core.Exceptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VideoService {
	
	private static final Logger logger = LoggerFactory.getLogger(VideoService.class);
	
	@Autowired
	private VideoRepository videoRepository;
	
    public Mono<UrlResource> getResourceByName(String name) {
        return videoRepository.getVideoByName(name)
                .flatMap(this::createUriResourceFromVideo);
    }
    
    public Flux<Video> getAllVideos() {
        return videoRepository.getAllVideos();
    }
    
    public long lengthOf(UrlResource urlResource) {
        long fileLength;
        try {
            fileLength = urlResource.contentLength();
        } catch (IOException e) {
            logger.error("efs-video-webflux: resource not found");
            throw Exceptions.propagate(new FileNotFoundException());
        }
        return fileLength;
    }

    private Mono<UrlResource> createUriResourceFromVideo(Video videoObj) {
        return Mono.<UrlResource>create(monoSink -> {
            try {
                UrlResource video = new UrlResource(videoObj.getLocation().toUri());
                monoSink.success(video);
            } catch (MalformedURLException e) {
                monoSink.error(e);
            }
        }).doOnError(throwable -> {
            throw Exceptions.propagate(throwable);
        });
    }

}
