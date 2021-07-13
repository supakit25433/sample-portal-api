package com.example.portal.api.controller;

import java.util.List;
import java.util.Map;

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
	
	@RequestMapping(path = "/digital/ministry", method = RequestMethod.GET)
	public Map<String, Object> getMinistry() {
		Map<String, Object> ml = pr.getMinistry();
		return ml;
	}
	
	@RequestMapping(path = "/digital/disbursement2563", method = RequestMethod.GET)
	public Map<String, Object> getBudgetAndDisbursement2563() {
		Map<String, Object> bdl = pr.getBudgetAndDisbursement2563();
		return bdl;
	}
	
	@RequestMapping(path = "/digital/province", method = RequestMethod.GET)
	public Map<String, Object> getProvincesList() {
		Map<String, Object> pl = pr.getProvinceList();
		return pl;
	}
	
	@RequestMapping(path = "/digital/department", method = RequestMethod.GET)
	public Map<String, Object> getDepartment() {
		Map<String, Object> dl = pr.getDepartmentList();
		return dl;
	}
	
	@RequestMapping(path = "/digital/juristic/0105537004444", method = RequestMethod.GET)
	public Map<String, Object> getJuristicOfSinosiam() {
		Map<String, Object> jl = pr.getJuristicOfSinosiam();
		return jl;
	}
	
}
