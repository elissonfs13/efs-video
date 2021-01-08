package com.efs.offlinevideo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfflineVideo {
	
	String id;
	
	String name;
	
	String filePath;
	
	String fileSize;
	
	String idOnlineVideo;

}
