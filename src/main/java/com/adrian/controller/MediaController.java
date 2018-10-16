package com.adrian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.dao.MediaDao;
import com.adrian.entity.Media;

@RestController
public class MediaController {
	
	@Autowired
	MediaDao mediaDao;
	
	@RequestMapping(value = "/medias", method = RequestMethod.GET, produces = { "application/JSON" })
	public List<Media> getAllMedia() {
		return mediaDao.getAllMedia();
	}
	
	@RequestMapping(value = "/medias", method = RequestMethod.POST, consumes = { "application/JSON" })
	public List<Media> addMedia(@RequestBody Media media) {
		int id = mediaDao.getAllMedia().size() + 1;
		media.setId(id);
		
		mediaDao.addMedia(media);
		
		return mediaDao.getAllMedia();
	}
}
