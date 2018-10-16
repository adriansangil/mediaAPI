package com.adrian.mediaAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.adrian.controller", "com.adrian.dao"})
public class MediaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaApiApplication.class, args);
	}
}
