package com.example.portal.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.ResourceRepository;

@RestController
@RequestMapping("/v1/resource")
public class ResourceController {

	@Autowired
	ResourceRepository rr;
	
	// structure problem - JSONArray must start with [ but it start with comment that occurs error.
	@RequestMapping(path = "/project/cdm", method = RequestMethod.GET)
	public List<Object> getCDMProject() {
		List<Object> ul = rr.getCDMProject();
		return ul;
	}
	
}
