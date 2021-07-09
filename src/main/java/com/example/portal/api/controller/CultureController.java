package com.example.portal.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.CultureRepository;

@RestController
@RequestMapping("/v1/culture")
public class CultureController {

	@Autowired
	CultureRepository cr;
	
	@RequestMapping(path = "/moral", method = RequestMethod.GET)
	public Map<String, Object> getMoral() {
		Map<String, Object> ul = cr.getMoral();
		return ul;
	}
	
	@RequestMapping(path = "/research/studies", method = RequestMethod.GET)
	public Map<String, Object> getResearchStudies() {
		Map<String, Object> ul = cr.getResearchStudies();
		return ul;
	}
	
	@RequestMapping(path = "/oldsiamesebook", method = RequestMethod.GET)
	public Map<String, Object> getOldSiameseBook() {
		Map<String, Object> ul = cr.getOldSiameseBook();
		return ul;
	}
	
	@RequestMapping(path = "/ethnicgroup", method = RequestMethod.GET)
	public Map<String, Object> getEthnicGroup() {
		Map<String, Object> ul = cr.getEthnicGroup();
		return ul;
	}
	
	@RequestMapping(path = "/folktoys", method = RequestMethod.GET)
	public Map<String, Object> getFolkToys() {
		Map<String, Object> ul = cr.getFolkToys();
		return ul;
	}
	
	@RequestMapping(path = "/communityarchives", method = RequestMethod.GET)
	public Map<String, Object> getCommunityArchives() {
		Map<String, Object> ul = cr.getCommunityArchives();
		return ul;
	}
	
	@RequestMapping(path = "/research/ethnographic", method = RequestMethod.GET)
	public Map<String, Object> getEthnographic() {
		Map<String, Object> ul = cr.getEthnographic();
		return ul;
	}
	
	@RequestMapping(path = "/inscription/watpho", method = RequestMethod.GET)
	public Map<String, Object> getWatPhoInscription() {
		Map<String, Object> ul = cr.getWatPhoInscription();
		return ul;
	}
	
	@RequestMapping(path = "/tales", method = RequestMethod.GET)
	public Map<String, Object> getTales() {
		Map<String, Object> ul = cr.getTales();
		return ul;
	}
	
}
