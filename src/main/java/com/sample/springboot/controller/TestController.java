package com.sample.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	@RequestMapping("/")
	public String home() {
		return "Spring boot is working!";
	}
	
	@RequestMapping("/function-a")
	public String mySampleFunction(){
		return "Hi there this is my sample API";
	}
}