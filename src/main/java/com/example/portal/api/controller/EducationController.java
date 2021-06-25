package com.example.portal.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.EducationRepository;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/v1")
public class EducationController {

	@Autowired
	EducationRepository er;
	
	@CrossOrigin("http://localhost")
	@RequestMapping(path = "/education/university", method = RequestMethod.GET)
	public List<Object> getUniversityList() {
		List<Object> ul = er.getUniversity();
		return ul;
	}
	
	@RequestMapping(path = "/education/demonstration", method = RequestMethod.GET)
	public List<Object> getDemonstrationList() {
		List<Object> dl = er.getDemonstration();
		return dl;
	}
	
	@RequestMapping(path = "/education/demonstration/numandsex", method = RequestMethod.GET)
	public List<Object> getDemonstrationNumAndSex() {
		List<Object> dnsl = er.getDemonstrationNumAndSex();
		return dnsl;
	}
	
}
