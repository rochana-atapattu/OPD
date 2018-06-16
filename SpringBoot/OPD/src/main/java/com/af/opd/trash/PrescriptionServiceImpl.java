package com.af.opd.trash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PrescriptionServiceImpl implements PrescriptionService{

	@Autowired
	PrescriptionRepository prescriptionRepository;
	@Override
	public String addPrescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPrescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
