package com.sample.springboot.controller;

import javax.websocket.server.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.solr.core.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.model.RequestModel;
import com.sample.springboot.model.SampleJson;

@RestController
@RequestMapping("/api/{version}")
public class TestController {
	@RequestMapping("/")
	public String home() {
		return "Spring boot is working!";
	}
	
	@GetMapping("/get-function")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<?> getFunction(@PathParam("version") String version){
		
		SampleJson json = new SampleJson();
		json.setId(123);
		json.setName("sample name");
		json.setDescription("Sample description");
		json.setConfidentialField("Don't show this field.");
		
		return new ResponseEntity<SampleJson>(json, HttpStatus.OK);
	}
	
	@PostMapping(
			value="/post-function",
			consumes={"application/JSON","application/XML"}, 
			produces={"application/JSON"})
	public ResponseEntity<?> postFunction(@RequestBody RequestModel requestModel, @PathParam("version") String version){
		
		SampleJson json = new SampleJson();
		json.setId(123);
		json.setName("Post name detail");
		json.setDescription("post description");
		json.setConfidentialField("Don't show this field.");
		
		return new ResponseEntity<SampleJson>(json, HttpStatus.OK);
	}
}