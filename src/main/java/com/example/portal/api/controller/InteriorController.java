package com.example.portal.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.InteriorRepository;

@RestController
@RequestMapping("/v1/interior")
public class InteriorController {

	@Autowired
	InteriorRepository pr;
	
	@RequestMapping(path = "/local/office/location", method = RequestMethod.GET)
	public Map<String, Object> getProvincialLocalOfficeLocation() {
		Map<String, Object> ploll = pr.getProvincialLocalOfficeLocation();
		return ploll;
	}
	
	@RequestMapping(path = "/organization/office/location", method = RequestMethod.GET)
	public Map<String, Object> getLocalAdministrativeOrganizationOfficeLocation() {
		Map<String, Object> laooll = pr.getLocalAdministrativeOrganizationOfficeLocation();
		return laooll;
	}
	
	@RequestMapping(path = "/organization/office/website", method = RequestMethod.GET)
	public Map<String, Object> getLocalAdministrativeOrganizationOfficeWebsite() {
		Map<String, Object> laoowl = pr.getLocalAdministrativeOrganizationOfficeWebsite();
		return laoowl;
	}
	
	@RequestMapping(path = "/organization/office/code", method = RequestMethod.GET)
	public Map<String, Object> getLocalAdministrativeOrganizationOfficeCode() {
		Map<String, Object> laoocl = pr.getLocalAdministrativeOrganizationOfficeCode();
		return laoocl;
	}
	
	@RequestMapping(path = "/school/location", method = RequestMethod.GET)
	public Map<String, Object> getLocalAdministrativeOrganizationSchoolLocation() {
		Map<String, Object> laoocl = pr.getLocalAdministrativeOrganizationSchoolLocation();
		return laoocl;
	}
	
}
