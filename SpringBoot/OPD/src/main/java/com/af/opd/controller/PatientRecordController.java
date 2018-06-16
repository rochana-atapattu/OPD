package com.af.opd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.af.opd.domain.PatientRecords;
import com.af.opd.model.PatientRecordForm;
import com.af.opd.service.PatientRecordService;

@RestController
@RequestMapping("/api/patientrecords")
public class PatientRecordController {

	@Autowired
	PatientRecordService patientRecordService;
	
	@PostMapping
	public String addPatientRecord(@RequestBody PatientRecordForm patientRecord) {
		return patientRecordService.addPatientRecord(patientRecord);
	}
}
