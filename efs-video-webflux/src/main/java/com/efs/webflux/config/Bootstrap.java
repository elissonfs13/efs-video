package com.efs.webflux.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.efs.webflux.entities.Video;
import com.efs.webflux.repositories.VideoRepository;
import com.efs.webflux.services.FileService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Bootstrap implements CommandLineRunner{
	
	@Autowired
	private FileService fileService;

	@Autowired
	private VideoRepository videoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		fileService.getAllFiles()
	        .doOnNext(path -> log.debug("efs-video-webflux: found file in path: " + path.toUri() + " FileName: " + path.getFileName()))
	        .flatMap(path -> {
	            Video video = new Video();
	            video.setName(path.getFileName().toString());
	            video.setLocation(path);
	            return videoRepository.addVideo(video);
	        })
	        .subscribe();

		videoRepository.getAllVideos()
	        .doOnNext(video -> log.info("efs-video-webflux: Registered video: " + video.getName()))
	        .subscribe();
			
	}

}
