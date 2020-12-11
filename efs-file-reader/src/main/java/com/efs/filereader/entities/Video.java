package com.efs.filereader.entities;

public class Video {
	
	private String identifier;
	private String name;
	private String url;
	private String localPath;
	
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
	
	public String getLocalPath() {
		return localPath;
	}
	
	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
	
	@Override
	public String toString() {
		return "Video [identifier=" + identifier + ", name=" + name + ", url=" + url + ", localPath=" + localPath + "]";
	}

}
