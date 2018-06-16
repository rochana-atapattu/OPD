package com.af.opd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.af.opd.domain.Doctor;
import com.af.opd.service.DoctorService;

@RestController
public class DoctorController {

	
	@Autowired
	DoctorService  doctorSerice;
	
	@PostMapping
	public void addDoctor(@RequestBody Doctor doctor) {
		System.out.println(doctor);
		doctorSerice.saveDoctor(doctor);
	}
}
