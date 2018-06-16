package com.af.opd.trash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LabTestServiceImpl implements LabTestService{

	@Autowired
	LabTestRepository labTestRepository;
	
	@Override
	public String addLabTest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
