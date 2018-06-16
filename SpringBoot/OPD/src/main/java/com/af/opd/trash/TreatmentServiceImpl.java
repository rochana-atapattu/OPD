package com.af.opd.trash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TreatmentServiceImpl implements TreatmentService{

	@Autowired
	TreatmentRepository treatmentRepository;
	@Override
	public String addTreatment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTreatment() {
		// TODO Auto-generated method stub
		return null;
	}

}
