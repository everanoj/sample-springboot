package com.sample.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SampleJson {
	
	private int id;
	private String name;
	private String description;

	@JsonIgnore
	private String confidentialField;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getConfidentialField() {
		return confidentialField;
	}
	public void setConfidentialField(String confidentialField) {
		this.confidentialField = confidentialField;
	}
	
}
