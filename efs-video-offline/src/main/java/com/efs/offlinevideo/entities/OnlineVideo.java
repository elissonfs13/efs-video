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
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getUrlSite() {
		return urlSite;
	}

	public void setUrlSite(String urlSite) {
		this.urlSite = urlSite;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getNameChannelSite() {
		return nameChannelSite;
	}

	public void setNameChannelSite(String nameChannelSite) {
		this.nameChannelSite = nameChannelSite;
	}

	public String getUrlChannelSite() {
		return urlChannelSite;
	}

	public void setUrlChannelSite(String urlChannelSite) {
		this.urlChannelSite = urlChannelSite;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getPreviewDate() {
		return previewDate;
	}

	public void setPreviewDate(LocalDate previewDate) {
		this.previewDate = previewDate;
	}

	@Override
	public String toString() {
		return "OnlineVideo [id=" + id + ", title=" + title + ", description=" + description + ", duration=" + duration
				+ ", urlSite=" + urlSite + ", category=" + category + ", nameChannelSite=" + nameChannelSite
				+ ", urlChannelSite=" + urlChannelSite + ", creationDate=" + creationDate + ", previewDate="
				+ previewDate + "]";
	}

}
