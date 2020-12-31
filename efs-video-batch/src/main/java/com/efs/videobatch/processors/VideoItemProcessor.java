package com.efs.videobatch.processors;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.efs.videobatch.entities.Video;

public class VideoItemProcessor implements ItemProcessor<File, Video> {
	
	private static Logger logger = LoggerFactory.getLogger(VideoItemProcessor.class);

    @Override
    public Video process(final File item) throws Exception {
    	
    	String name = item.getAbsoluteFile().getName();
    	
        Video video = Video.builder()
        		.id(buildIdentifierByName(name))
                .filename(name)
                .absolutePath(item.getAbsolutePath())
                .fileSize(item.getTotalSpace())
                .build();

        logger.info("efs-video-batch: FILE IN VIDEO PATH: {}", video);

        return video;
    }
    
    private String buildIdentifierByName(String filename) throws NoSuchAlgorithmException, UnsupportedEncodingException {
    	
    	byte[] hash = MessageDigest
    			.getInstance("MD5")
    			.digest(filename.getBytes("UTF-8"));
    	
		return new BigInteger(1, hash).toString(16);
    }
}