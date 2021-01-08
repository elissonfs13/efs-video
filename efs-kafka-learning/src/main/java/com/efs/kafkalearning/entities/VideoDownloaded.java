package com.efs.kafkalearning.entities;

public class VideoDownloaded {
	
	String identifier;
	String idOnlineVideo;
	String title;
	String url;
	String size;
	
	
	
	public VideoDownloaded(String identifier, String idOnlineVideo, String title, String url, String size) {
		this.identifier = identifier;
		this.idOnlineVideo = idOnlineVideo;
		this.title = title;
		this.url = url;
		this.size = size;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getIdOnlineVideo() {
		return idOnlineVideo;
	}
	public void setIdOnlineVideo(String idOnlineVideo) {
		this.idOnlineVideo = idOnlineVideo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "VideoDownloaded [identifier=" + identifier + ", idOnlineVideo=" + idOnlineVideo + ", title=" + title
				+ ", url=" + url + ", size=" + size + "]";
	}

}
