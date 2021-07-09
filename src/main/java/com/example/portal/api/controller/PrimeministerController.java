package com.example.portal.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.PrimeministerRepository;

@RestController
@RequestMapping("/v1/primeminister")
public class PrimeministerController {

	@Autowired
	PrimeministerRepository pr;

	@RequestMapping(path = "/insignia/list", method = RequestMethod.GET)
	public List<Object> getInsigniaList() {
		List<Object> response = pr.getInsigniaList();
		return response;
	}
	
	@RequestMapping(path = "/government/gazette/announcement", method = RequestMethod.GET)
	public List<Object> getGovernmentGazetteAnnouncement() {
		List<Object> response = pr.getGovernmentGazetteAnnouncement();
		return response;
	}
	
}
