package com.efs.filereader.entities;

public class SparkVideo {
	
	private String identifier;
	private String name;
	private String url;
	private String description;
	private String duration;
	private String category;
	private String idOnlineVideo;
	private String localPath;
	private String size;
	
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getIdOnlineVideo() {
		return idOnlineVideo;
	}
	public void setIdOnlineVideo(String idOnlineVideo) {
		this.idOnlineVideo = idOnlineVideo;
	}
	public String getLocalPath() {
		return localPath;
	}
	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "SparkVideo [identifier=" + identifier + ", name=" + name + ", url=" + url + ", description="
				+ description + ", duration=" + duration + ", category=" + category + ", idOnlineVideo=" + idOnlineVideo
				+ ", localPath=" + localPath + ", size=" + size + "]";
	}
	
}
