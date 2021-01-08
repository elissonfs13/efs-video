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
		this.id = id;
		this.filename = filename;
	}
	
	public String fileSizeFormated() {
		if (this.fileSize < 1024) 
			return fileSize.toString() + " bytes";
		return getFileSizeInKiloBytes(fileSize/1024);
	}
	
	private String getFileSizeInKiloBytes(Long fileSizeInKiloBytes) {
		if (fileSizeInKiloBytes < 1024)
			return fileSizeInKiloBytes.toString() + " Kb"; 
		return getFileSizeInMegaBytes(fileSizeInKiloBytes/1024);
	}

	private String getFileSizeInMegaBytes(Long fileSizeInMegaBytes) {
		if (fileSizeInMegaBytes < 1024)
			return fileSizeInMegaBytes.toString() + " Mb"; 
		return getFileSizeInGigaBytes(fileSizeInMegaBytes/1024);
	}

	private String getFileSizeInGigaBytes(Long fileSizeInGigaBytes) {
		return fileSizeInGigaBytes.toString() + " Gb"; 
	}
	
	

}
