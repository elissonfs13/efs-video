package com.efs.videobatch.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Video {
	
	String id;
	
	String filename;
	
	String absolutePath;
	
	Long fileSize;

	public Video(String id, String filename) {
		super();
		this.id = id;
		this.filename = filename;
	}
	
	

}
