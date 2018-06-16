package com.af.opd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.af.opd.model.PatientHistory;
import com.af.opd.model.Visit;
import com.af.opd.service.VisitHistoryService;
import com.af.opd.trash.VisitService;

@RestController
@RequestMapping("/api/patienthistory")
public class VisitHistoryController {

	
	
	@Autowired
	VisitHistoryService visitHistoryService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public PatientHistory getVisit(@PathVariable String id){
		return visitHistoryService.visitHistory(id);
	}
	
}
