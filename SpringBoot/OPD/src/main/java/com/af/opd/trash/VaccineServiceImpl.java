package com.af.opd.trash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VaccineServiceImpl implements VaccineService{

	@Autowired
	VaccineRepository vaccineRepository;
	
	@Override
	public String addVaccine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVaccine() {
		// TODO Auto-generated method stub
		return null;
	}

}
