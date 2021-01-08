package com.efs.onlinevideo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VideoDownloaded {
	
	String identifier;
	
	String idOnlineVideo;
	
	String title;
	
	String url;
	
	String size;

}
