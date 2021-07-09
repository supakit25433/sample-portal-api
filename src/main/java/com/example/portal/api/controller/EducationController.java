package com.example.portal.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.EducationRepository;

@RestController
@RequestMapping("/v1/education")
public class EducationController {

	@Autowired
	EducationRepository er;
	
	@RequestMapping(path = "/university/information/2563", method = RequestMethod.GET)
	public List<Object> getUniversityList() {
		List<Object> ul = er.getUniversity();
		return ul;
	}
	
	@RequestMapping(path = "/demonstration/list", method = RequestMethod.GET)
	public List<Object> getDemonstrationList() {
		List<Object> dl = er.getDemonstration();
		return dl;
	}
	
	@RequestMapping(path = "/demonstration/list/bynameandgender/2563", method = RequestMethod.GET)
	public List<Object> getDemonstrationNameAndGender() {
		List<Object> dnsl = er.getDemonstrationNameAndGender();
		return dnsl;
	}
	
	@RequestMapping(path = "/data/university/2563", method = RequestMethod.GET)
	public List<Object> getUniversityData2563() {
		List<Object> dnsl = er.getUniversityData2563();
		return dnsl;
	}
	
	@RequestMapping(path = "/data/workcondition/2563", method = RequestMethod.GET)
	public List<Object> getWorkCondition2563() {
		List<Object> dnsl = er.getWorkCondition2563();
		return dnsl;
	}
	
	@RequestMapping(path = "/data/graduate/2563", method = RequestMethod.GET)
	public List<Object> getGraduateData2563() {
		List<Object> dnsl = er.getGraduateData2563();
		return dnsl;
	}
	
	@RequestMapping(path = "/data/staff/2563", method = RequestMethod.GET)
	public List<Object> getStaffData2563() {
		List<Object> dnsl = er.getStaffData2563();
		return dnsl;
	}
	
	@RequestMapping(path = "/data/student/2563", method = RequestMethod.GET)
	public List<Object> getStudentData2563() {
		List<Object> dnsl = er.getStudentData2563();
		return dnsl;
	}
	
	@RequestMapping(path = "/university/course", method = RequestMethod.GET)
	public List<Object> getUniversityCourse() {
		List<Object> dnsl = er.getUniversityCourse();
		return dnsl;
	}
	
	// long load
	@RequestMapping(path = "/university/graduate/number/byinstitution/2562", method = RequestMethod.GET)
	public List<Object> getNumberOfGraduateByInstitution2562() {
		List<Object> dnsl = er.getNumberOfGraduateByInstitution2562();
		return dnsl;
	}
	
	@RequestMapping(path = "/university/list/bygroup", method = RequestMethod.GET)
	public List<Object> getUniversityListByGroup() {
		List<Object> dnsl = er.getUniversityListByGroup();
		return dnsl;
	}
	
	@RequestMapping(path = "/university/graduate/number/byfacultyanddepartment/2562", method = RequestMethod.GET)
	public List<Object> getNumberOfGraduateByFacultyAndDepartment2562() {
		List<Object> dnsl = er.getNumberOfGraduateByFacultyAndDepartment2562();
		return dnsl;
	}
	
	@RequestMapping(path = "/university/student/number/2562", method = RequestMethod.GET)
	public List<Object> getNumberOfStudent2562() {
		List<Object> dnsl = er.getNumberOfStudent2562();
		return dnsl;
	}
	
	@RequestMapping(path = "/university/staff/number/2563", method = RequestMethod.GET)
	public List<Object> getNumberOfStaff2563() {
		List<Object> dnsl = er.getNumberOfStaff2563();
		return dnsl;
	}
	
	// server error - not found
	@RequestMapping(path = "/researcher/list/economicanimal", method = RequestMethod.GET)
	public List<Object> getResearcherListOfEconomicAnimal() {
		List<Object> dnsl = er.getResearcherListOfEconomicAnimal();
		return dnsl;
	}
	
	// server error - not found
	@RequestMapping(path = "/researcher/list/energy", method = RequestMethod.GET)
	public List<Object> getResearcherListOfEnergy() {
		List<Object> dnsl = er.getResearcherListOfEnergy();
		return dnsl;
	}
	
	// server error - not found
	@RequestMapping(path = "/researcher/list/technology", method = RequestMethod.GET)
	public List<Object> getResearcherListOfTechnology() {
		List<Object> dnsl = er.getResearcherListOfTechnology();
		return dnsl;
	}
	
	// server error - not found
	@RequestMapping(path = "/researcher/list/watermanagement", method = RequestMethod.GET)
	public List<Object> getResearcherListOfWaterManagement() {
		List<Object> dnsl = er.getResearcherListOfWaterManagement();
		return dnsl;
	}
	
	// server error - not found
	@RequestMapping(path = "/researcher/list/zerowaste", method = RequestMethod.GET)
	public List<Object> getResearcherListOfZeroWaste() {
		List<Object> dnsl = er.getResearcherListOfZeroWaste();
		return dnsl;
	}
	
}
