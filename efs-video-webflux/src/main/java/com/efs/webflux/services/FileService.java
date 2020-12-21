package com.efs.webflux.services;

import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.BaseStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class FileService {
	
	@Value("${video.location}")
    private String videoLocation;

    public Flux<Path> getAllFiles() {
        return fromPath(Paths.get(videoLocation));
    }
	
	private Flux<Path> fromPath(Path path) {
        return Flux.using(() -> Files.walk(path, FileVisitOption.FOLLOW_LINKS),
                Flux::fromStream,
                BaseStream::close)
                .doOnDiscard(BaseStream.class, BaseStream::close)
                .doOnError(err -> {
                    throw new RuntimeException();
                })
                .filter(filePath -> !filePath.toFile().isDirectory())
                .filter(filePath -> !filePath.getFileName().toString().startsWith("."));
    }

}
