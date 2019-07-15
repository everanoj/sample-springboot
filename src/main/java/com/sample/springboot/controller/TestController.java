package com.sample.springboot.controller;

import javax.websocket.server.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.model.SampleJson;

@RestController
@RequestMapping("/api")
public class TestController {
	@RequestMapping("/")
	public String home() {
		return "Spring boot is working!";
	}
	
	@GetMapping("/{version}/function-a")
	@Produces(MediaType.APPLICATION_JSON)
	public SampleJson mySampleFunction(@PathParam("version") String version){
		
		SampleJson json = new SampleJson();
		json.setId(123);
		json.setName("sample name");
		json.setDescription("Sample description");
		json.setConfidentialField("Don't show this field.");
		
		return json;
	}
	
	
}