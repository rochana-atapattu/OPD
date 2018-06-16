package com.af.opd.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.af.opd.domain.Doctor;
import com.af.opd.repositories.DoctorRepository;
import com.af.opd.service.DoctorService;


@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	DoctorRepository doctorRepository;
	@Override
	public void saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.save(doctor);
	}

}
