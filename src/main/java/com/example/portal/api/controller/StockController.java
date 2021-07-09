package com.example.portal.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.StockRepository;

@RestController
@RequestMapping("/v1/stock")
public class StockController {
	
	@Autowired
	StockRepository sr;
	
	@RequestMapping(path = "/approval/office/type", method = RequestMethod.GET)
	public List<Object> getApprovalOfficeType() {
		List<Object> response = sr.getApprovalOfficeType();
		return response;
	}
	
	@RequestMapping(path = "/approval/person/type", method = RequestMethod.GET)
	public List<Object> getApprovalPersonType() {
		List<Object> response = sr.getApprovalPersonType();
		return response;
	}
	
	@RequestMapping(path = "/buysell/type", method = RequestMethod.GET)
	public List<Object> getBuySellType() {
		List<Object> response = sr.getBuySellType();
		return response;
	}
	
	@RequestMapping(path = "/currency", method = RequestMethod.GET)
	public List<Object> getCurrency() {
		List<Object> response = sr.getCurrency();
		return response;
	}

	@RequestMapping(path = "/action/type", method = RequestMethod.GET)
	public List<Object> getActionType() {
		List<Object> response = sr.getActionType();
		return response;
	}

	@RequestMapping(path = "/offering/type", method = RequestMethod.GET)
	public List<Object> getOfferingType() {
		List<Object> response = sr.getOfferingType();
		return response;
	}
	
	@RequestMapping(path = "/assetmanagement/lists", method = RequestMethod.GET)
	public List<Object> getAssetManagementList() {
		List<Object> response = sr.getAssetManagementList();
		return response;
	}
	
	@RequestMapping(path = "/data/daily/list", method = RequestMethod.GET)
	public List<Object> getDataDailyList() {
		List<Object> response = sr.getDataDailyList();
		return response;
	}
	
	@RequestMapping(path = "/corporation/licensed", method = RequestMethod.GET)
	public List<Object> getLicensedCorporation() {
		List<Object> response = sr.getLicensedCorporation();
		return response;
	}
	
	@RequestMapping(path = "/investor/warninformation", method = RequestMethod.GET)
	public List<Object> getWarnInformationInvestor() {
		List<Object> response = sr.getWarnInformationInvestor();
		return response;
	}
	
}
