package com.adrian.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.adrian.entity.Media;

@Component
public class MediaDao {
	
	List<Media> mediaList;
	
	MediaDao() {
		mediaList = new ArrayList<>();
		Media media = new Media();
		media.setId(mediaList.size()+1);
		media.setTitle("Our Minimal Products");
		media.setImage("minimal");
		
		mediaList.add(media);
		
		Media media2 = new Media();
		media2.setId(mediaList.size()+1);
		media2.setTitle("Headphones");
		media2.setImage("headphones");
		
		mediaList.add(media2);
	}
	
	public List<Media> getAllMedia() {
		
		return mediaList;
	}
	
	public List<Media> addMedia(Media media) {
		mediaList.add(media);
		
		return mediaList;
	}

}
