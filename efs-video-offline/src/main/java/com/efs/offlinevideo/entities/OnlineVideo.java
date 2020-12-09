package com.efs.offlinevideo.entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OnlineVideo {
	
	private String id;
	
	private String title;
	
	private String description;
	
	private String duration;
	
	private String urlSite;

	private Category category;
	
	private String nameChannelSite;
	
	private String urlChannelSite;
	
	private LocalDate creationDate;
	
	private LocalDate previewDate;

}
