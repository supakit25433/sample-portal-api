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

	// unable to find valid certification path to requested target
	@RequestMapping(path = "/importerexporterlist", method = RequestMethod.GET)
	public List<Object> getCPFImporterExporter() {
		List<Object> ie = cr.getCPFimporterexporter();
		return ie;
	}

	// unable to find valid certification path to requested target
	@RequestMapping(path = "/department/member/type", method = RequestMethod.GET)
	public List<Object> getDepartmentMemberType() {
		List<Object> ie = cr.getDepartmentMemberType();
		return ie;
	}

	// unable to find valid certification path to requested target
	@RequestMapping(path = "/rice/trader", method = RequestMethod.GET)
	public List<Object> getRiceTrader() {
		List<Object> ie = cr.getRiceTrader();
		return ie;
	}

	// unable to find valid certification path to requested target
	@RequestMapping(path = "/department/member/search/bytype", method = RequestMethod.GET)
	public List<Object> getSearchDepartmentMemberByType() {
		List<Object> ie = cr.getSearchDepartmentMemberByType();
		return ie;
	}

	// unable to find valid certification path to requested target
	@RequestMapping(path = "/copyright/search/bykeyword", method = RequestMethod.GET)
	public List<Object> getSearchCopyrightByKeyword() {
		List<Object> ie = cr.getSearchCopyrightByKeyword();
		return ie;
	}

	// unable to find valid certification path to requested target
	@RequestMapping(path = "/trademark/search/bykeyword", method = RequestMethod.GET)
	public List<Object> getSearchTrademarkByKeyword() {
		List<Object> ie = cr.getSearchTrademarkByKeyword();
		return ie;
	}

	// unable to find valid certification path to requested target
	@RequestMapping(path = "/product/information", method = RequestMethod.GET)
	public List<Object> getProductInformation() {
		List<Object> ie = cr.getProductInformation();
		return ie;
	}

	// unable to find valid certification path to requested target
	@RequestMapping(path = "/thailand/internationaltrade/overview", method = RequestMethod.GET)
	public List<Object> getThailandInternationalOverview() {
		List<Object> ie = cr.getThailandInternationalOverview();
		return ie;
	}

	// unable to find valid certification path to requested target
	@RequestMapping(path = "/agricultural/products", method = RequestMethod.GET)
	public List<Object> getAgriculturalProduct() {
		List<Object> ie = cr.getAgriculturalProduct();
		return ie;
	}

	// unable to find valid certification path to requested target
		@RequestMapping(path = "/activity/type", method = RequestMethod.GET)
		public List<Object> getActivityType() {
			List<Object> ie = cr.getActivityType();
			return ie;
		}
	
}
