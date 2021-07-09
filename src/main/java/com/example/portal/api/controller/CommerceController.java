package com.example.portal.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.CommerceRepository;

@RestController
@RequestMapping("/v1/commerce")
public class CommerceController {
	
	@Autowired
	CommerceRepository cr;
	
	@RequestMapping(path = "/permanentsecretary/importerexporterlist", method = RequestMethod.GET)
	public List<Object> getCPFImporterExporter(){
		List<Object> ie = cr.getCPFimporterexporter();
		return ie;
	}
	
}
