package com.example.portal.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.AgricultureRepository;

@RestController
@RequestMapping("/v1/agriculture")
public class AgricultureController {

	@Autowired
	AgricultureRepository ar;
	
	@RequestMapping(path = "/agricultural/price/daily", method = RequestMethod.GET)
	public List<Object> getAgriculturalPriceDaily() {
		List<Object> response = ar.getAgriculturalPriceDaily();
		return response;
	}
	
	@RequestMapping(path = "/fertilizer/import/formula", method = RequestMethod.GET)
	public Map<String, Object> getImportFertilizerFormula() {
		Map<String, Object> response = ar.getImportFertilizerFormula();
		return response;
	}
	
	@RequestMapping(path = "/fertilizer/import/country", method = RequestMethod.GET)
	public Map<String, Object> getImportFertilizerCountry() {
		Map<String, Object> response = ar.getImportFertilizerCountry();
		return response;
	}
	
	@RequestMapping(path = "/fertilizer/import/importantformula", method = RequestMethod.GET)
	public Map<String, Object> getImportFertilizerImportantFormula() {
		Map<String, Object> response = ar.getImportFertilizerImportantFormula();
		return response;
	}
	
	@RequestMapping(path = "/qrestaurant/list", method = RequestMethod.GET)
	public List<Object> getQRestaurantList() {
		List<Object> response = ar.getQRestaurantList();
		return response;
	}
	
	@RequestMapping(path = "/agricultural/standards", method = RequestMethod.GET)
	public Map<String, Object> getAgriculturalStandards() {
		Map<String, Object> response = ar.getAgriculturalStandards();
		return response;
	}
	
	@RequestMapping(path = "/royalrainmaking/actionplan", method = RequestMethod.GET)
	public List<Object> getRoyalRainMakingActionPlan() {
		List<Object> response = ar.getRoyalRainMakingActionPlan();
		return response;
	}
	
	@RequestMapping(path = "/royalrainmaking/results", method = RequestMethod.GET)
	public List<Object> getRoyalRainMakingResults() {
		List<Object> response = ar.getRoyalRainMakingResults();
		return response;
	}
	
	@RequestMapping(path = "/royalrainmaking/rainyarea", method = RequestMethod.GET)
	public List<Object> getRoyalRainMakingRainyArea() {
		List<Object> response = ar.getRoyalRainMakingRainyArea();
		return response;
	}
	
	@RequestMapping(path = "/royalrainmaking/targetarea", method = RequestMethod.GET)
	public List<Object> getRoyalRainMakingTargetArea() {
		List<Object> response = ar.getRoyalRainMakingTargetArea();
		return response;
	}
	
}
