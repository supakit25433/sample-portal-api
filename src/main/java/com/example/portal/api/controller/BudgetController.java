package com.example.portal.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.BudgetRepository;

@RestController
@RequestMapping("/v1/governBudget")
public class BudgetController {

	@Autowired
	BudgetRepository br;
	
	@RequestMapping(path = "/procurementproject", method = RequestMethod.GET)
	public Map<String, Object> getProcurementProject() {
		Map<String, Object> ppl = br.getProcurementProject();
		return ppl;
	}
	
	@RequestMapping(path = "/publicdebt", method = RequestMethod.GET)
	public Map<String, Object> getPublicDebt() {
		Map<String, Object> jl = br.getPublicDebt();
		return jl;
	}
	
}
