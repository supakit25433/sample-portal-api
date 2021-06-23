package com.example.portal.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.BudgetRepository;

@RestController
@RequestMapping("/v1")
public class BudgetController {

	@Autowired
	BudgetRepository br;
	
	@RequestMapping(path = "/governBudget/ministry", method = RequestMethod.GET)
	public Map<String, Object> getMinistry() {
		Map<String, Object> ml = br.getMinistry();
		return ml;
	}
	
	@RequestMapping(path = "/governBudget/procurementproject", method = RequestMethod.GET)
	public Map<String, Object> getProcurementProject() {
		Map<String, Object> ppl = br.getProcurementProject();
		return ppl;
	}
	
	@RequestMapping(path = "/governBudget/disbursement2563", method = RequestMethod.GET)
	public Map<String, Object> getBudgetAndDisbursement2563() {
		Map<String, Object> bdl = br.getBudgetAndDisbursement2563();
		return bdl;
	}
	
	@RequestMapping(path = "/governBudget/province", method = RequestMethod.GET)
	public Map<String, Object> getProvincesList() {
		Map<String, Object> pl = br.getProvinceList();
		return pl;
	}
	
	@RequestMapping(path = "/governBudget/department", method = RequestMethod.GET)
	public Map<String, Object> getDepartment() {
		Map<String, Object> dl = br.getDepartmentList();
		return dl;
	}
	
	@RequestMapping(path = "/governBudget/juristic", method = RequestMethod.GET)
	public Map<String, Object> getJuristicOfSinosiam() {
		Map<String, Object> jl = br.getJuristicOfSinosiam();
		return jl;
	}
	
}
