package com.example.portal.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.IndustryRepository;

@RestController
@RequestMapping("/v1/industry")
public class IndustryController {

	@Autowired
	IndustryRepository ir;
	
	@RequestMapping(path = "/thailand/mineral/production/2016", method = RequestMethod.GET)
	public Map<String, Object> getMineralProduction2016() {
		Map<String, Object> response = ir.getMineral2016();
		return response;
	}
	
	// data in json is missing that occurs error
	@RequestMapping(path = "/thailand/mineral/production/2015", method = RequestMethod.GET)
	public Map<String, Object> getMineralProduction2015() {
		Map<String, Object> response = ir.getMineral2015();
		return response;
	}
	
	// data in json is missing that occurs error
	@RequestMapping(path = "/thailand/mineral/production/2014", method = RequestMethod.GET)
	public Map<String, Object> getMineralProduction2014() {
		Map<String, Object> response = ir.getMineral2014();
		return response;
	}
	
}
