package com.example.portal.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.TransportRepository;

@RestController
@RequestMapping("/v1/transport")
public class TransportController {

	@Autowired
	TransportRepository tr;
	
	@RequestMapping(path = "/train/passenger", method = RequestMethod.GET)
	public List<Object> getPassenger() {
		List<Object> ul = tr.getPassenger();
		return ul;
	}
	
	@RequestMapping(path = "/train/station", method = RequestMethod.GET)
	public List<Object> getStation() {
		List<Object> ul = tr.getStation();
		return ul;
	}
	
}
