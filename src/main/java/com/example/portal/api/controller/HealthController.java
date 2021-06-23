package com.example.portal.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.HealthRepository;

@RestController
@RequestMapping("/v1")
public class HealthController {

	@Autowired
	HealthRepository hr;
	
	@RequestMapping(path = "/health/covid-19/daily", method = RequestMethod.GET)
	public Map<String, Object> getDailyCovid() {
		Map<String, Object> response = hr.getDailyCovid();
		return response;
	}
	
	@RequestMapping(path = "/health/covid-19/timeline", method = RequestMethod.GET)
	public Map<String, Object> getTimelineCovid() {
		Map<String, Object> tlcl = hr.getTimelineCovid();
		return tlcl;
	}
	
	@RequestMapping(path = "/health/covid-19/bycase", method = RequestMethod.GET)
	public Map<String, Object> getCaseCovid() {
		Map<String, Object> ccl = hr.getCaseCovid();
		return ccl;
	}
	
}
