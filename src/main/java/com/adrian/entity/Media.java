package com.adrian.entity;

public class Media {
	
	private Integer id;
	private String title;
	private String image;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = "http://bit.ly/gateB-" + image;
	}

}
