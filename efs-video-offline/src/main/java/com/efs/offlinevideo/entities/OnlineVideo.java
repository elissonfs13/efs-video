package com.efs.offlinevideo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OnlineVideo {
	
	public OnlineVideo(String id, String title, String description, String duration, String urlSite, String category,
			String idOfflineVideo) {

		this.id = id;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.urlSite = urlSite;
		this.category = Category.valueOf(category);
		this.idOfflineVideo = idOfflineVideo;
	}

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
