package com.example.portal.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.PoliticsRepository;

@RestController
@RequestMapping("/v1")
public class PoliticsController {

	@Autowired
	PoliticsRepository pr;
	
	@RequestMapping(path = "/politics/localoffice/location", method = RequestMethod.GET)
	public Map<String, Object> getProvincialLocalOfficeLocation() {
		Map<String, Object> ploll = pr.getProvincialLocalOfficeLocation();
		return ploll;
	}
	
	@RequestMapping(path = "/politics/organizationoffice/location", method = RequestMethod.GET)
	public Map<String, Object> getLocalAdministrativeOrganizationOfficeLocation() {
		Map<String, Object> laooll = pr.getLocalAdministrativeOrganizationOfficeLocation();
		return laooll;
	}
	
	@RequestMapping(path = "/politics/organizationoffice/website", method = RequestMethod.GET)
	public Map<String, Object> getLocalAdministrativeOrganizationOfficeWebsite() {
		Map<String, Object> laoowl = pr.getLocalAdministrativeOrganizationOfficeWebsite();
		return laoowl;
	}
	
	@RequestMapping(path = "/politics/organizationoffice/code", method = RequestMethod.GET)
	public Map<String, Object> getLocalAdministrativeOrganizationOfficeCode() {
		Map<String, Object> laoocl = pr.getLocalAdministrativeOrganizationOfficeCode();
		return laoocl;
	}
	
}
