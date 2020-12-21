package com.efs.webflux.repositories;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.efs.webflux.entities.Video;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class VideoRepository {
	
	private final Map<String, Video> videoCache = new ConcurrentHashMap<>();

    public Mono<Video> getVideoByName(String name) {
        return Mono.create(videoMonoSink -> {
            Video video = videoCache.get(name);
            if (video != null)
                videoMonoSink.success(video);
            else
                videoMonoSink.error(new FileNotFoundException());
        });
    }

    public Flux<Video> getAllVideos() {
        synchronized (videoCache) {
            return Flux.fromIterable(videoCache.values());
        }
    }

    public Mono<Video> addVideo(Video video) {
        synchronized (videoCache) {
            return Mono.fromCallable(() -> videoCache.put(video.getName(), video));
        }
    }

}
