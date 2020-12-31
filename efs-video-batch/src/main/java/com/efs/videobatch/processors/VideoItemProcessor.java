package com.efs.videobatch.processors;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.efs.videobatch.entities.Video;

public class VideoItemProcessor implements ItemProcessor<File, Video> {
	
	private static Logger logger = LoggerFactory.getLogger(VideoItemProcessor.class);

    @Override
    public Video process(final File item) throws Exception {
        Video video = Video.builder()
                .filename(item.getAbsoluteFile().getName())
                .absolutePath(item.getAbsolutePath())
                .fileSize(item.getTotalSpace())
                .build();

        logger.info("efs-video-batch: FILE IN VIDEO PATH: {}", video);

        return video;
    }
}