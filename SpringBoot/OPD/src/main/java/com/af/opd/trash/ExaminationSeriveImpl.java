package com.af.opd.trash;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.af.opd.model.Examinations;

@Service
public class ExaminationSeriveImpl implements ExaminationService{

	private List<Object> obj;
	

	@Autowired
	ExaminationRepository examinationRepository;
	
	@Override
	public String addExamination(Examinations examination) {
		
		return null;
	}

	@Override
	public void getExamination(String id) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public List<Examinations> getExamination() {
		// TODO Auto-generated method stub
		return null;
	}

}
