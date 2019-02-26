package org.atmecs.falcongetmethods.controllers;

import org.atmecs.falcongetmethods.models.AnalysisResponseModel;
import org.atmecs.falcongetmethods.models.TestReportModel;
import org.atmecs.falcongetmethods.properties.TestReportProperties;
import org.atmecs.falcongetmethods.repositories.TestReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testReport")
public class TestReportController {

	@Autowired
	TestReportRepository testReportRepository;
	
	@Autowired
	TestReportProperties properties; 
	
	@GetMapping("/get/{runSessionId}")
	public AnalysisResponseModel result(@PathVariable("runSessionId")int runSessionId ) {
		
		TestReportModel testReportModel= testReportRepository.findByRunsessionid(runSessionId);
		if(testReportModel.getTestphase().equals("Regression") && testReportModel.getPasspercentage()>95)
			return new AnalysisResponseModel(properties.getGoMessage(),testReportModel.getTestphase(),testReportModel.getPasspercentage());
		else if(testReportModel.getTestphase().equals("Smoke") && testReportModel.getPasspercentage()==100)
			return new AnalysisResponseModel(properties.getGoMessage(),testReportModel.getTestphase(),testReportModel.getPasspercentage());
		return new AnalysisResponseModel(properties.getNoMessage(),testReportModel.getTestphase(),testReportModel.getPasspercentage());
	}

}
