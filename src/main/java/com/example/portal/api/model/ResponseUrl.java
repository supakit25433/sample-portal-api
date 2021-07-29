package com.example.portal.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResponseUrl {

	@Id
	private String path_variable;
	
	private String response_type;
	
	private Integer response_code;

	private String response_message;

	@Column(columnDefinition = "LONGTEXT")
	private String response_data;

	public String getPath_variable() {
		return path_variable;
	}

	public void setPath_variable(String path_variable) {
		this.path_variable = path_variable;
	}

	public String getResponse_type() {
		return response_type;
	}

	public void setResponse_type(String response_type) {
		this.response_type = response_type;
	}

	public Integer getResponse_code() {
		return response_code;
	}

	public void setResponse_code(Integer response_code) {
		this.response_code = response_code;
	}

	public String getResponse_message() {
		return response_message;
	}

	public void setResponse_message(String response_message) {
		this.response_message = response_message;
	}

	public String getResponse_data() {
		return response_data;
	}

	public void setResponse_data(String response_data) {
		this.response_data = response_data;
	}
	
}
