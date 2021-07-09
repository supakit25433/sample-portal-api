package com.example.portal.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.HealthRepository;

@RestController
@RequestMapping("/v1/health")
public class HealthController {

	@Autowired
	HealthRepository hr;
	
	@RequestMapping(path = "/anamai/waste2020", method = RequestMethod.GET)
	public Map<String, Object> getWasteStat2020() {
		Map<String, Object> response = hr.getWasteStat2020();
		return response;
	}
	
	@RequestMapping(path = "/anamai/ingreen2020", method = RequestMethod.GET)
	public Map<String, Object> getInGreen2020() {
		Map<String, Object> response = hr.getInGreen2020();
		return response;
	}
	
	@RequestMapping(path = "/anamai/outgreen2020", method = RequestMethod.GET)
	public Map<String, Object> getOutGreen2020() {
		Map<String, Object> response = hr.getOutGreen2020();
		return response;
	}
	
	@RequestMapping(path = "/anamai/healthy2020", method = RequestMethod.GET)
	public Map<String, Object> getHealthy2020() {
		Map<String, Object> response = hr.getHealthy2020();
		return response;
	}
	
	@RequestMapping(path = "/anamai/servicelevel2020", method = RequestMethod.GET)
	public Map<String, Object> getServiceLevel2020() {
		Map<String, Object> response = hr.getServiceLevel2020();
		return response;
	}
	
	@RequestMapping(path = "/anamai/drinkingwaterquality2020", method = RequestMethod.GET)
	public Map<String, Object> getDrinkingWaterQuality2020() {
		Map<String, Object> response = hr.getDrinkingWaterQuality2020();
		return response;
	}
	
	@RequestMapping(path = "/covid-19/daily", method = RequestMethod.GET)
	public Map<String, Object> getDailyCovid() throws Exception {
		Map<String, Object> response = hr.getDailyCovid();
		return response;
	}
	
	@RequestMapping(path = "/covid-19/timeline", method = RequestMethod.GET)
	public Map<String, Object> getTimelineCovid() {
		Map<String, Object> tlcl = hr.getTimelineCovid();
		return tlcl;
	}
	
	@RequestMapping(path = "/covid-19/bycase", method = RequestMethod.GET)
	public Map<String, Object> getCaseCovid() {
		Map<String, Object> ccl = hr.getCaseCovid();
		return ccl;
	}
	
}
