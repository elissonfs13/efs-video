package com.efs.onlinevideo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "onlinevideos")
public class OnlineVideo {
	
	@Id
	private String id;
	
	private String title;
	
	private String description;
	
	private String duration;
	
	private String urlSite;

	private Category category;
	
	private String idOfflineVideo;

	@Override
	public String toString() {
		return "OnlineVideo [id=" + id + ", title=" + title + ", description=" + description + ", duration=" + duration
				+ ", urlSite=" + urlSite + ", category=" + category + ", idOfflineVideo=" + idOfflineVideo + "]";
	}
	
}
