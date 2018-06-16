package com.af.opd.trash;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.af.opd.model.Examinations;
import com.af.opd.model.Prescription;
import com.af.opd.model.Treatment;
import com.af.opd.model.Vaccine;
import com.af.opd.model.Visit;

@Service
public class VisitServiceImpl implements VisitService{

	@Autowired
	VisitRepository visitRepository;
	List<Object> object; 
	Visit visit;
	
	
	@Override
	public List<Visit> getAll(){
		return visitRepository.findAll();
	}
	
	@Override
	public void saveExamination(Examinations examinations) {
		object.add(examinations);
	}
	
	@Override
	public void saveLabTest(LabTestServiceImpl examinations) {
		object.add(examinations);
	}
	@Override
	public void savePrescription(Prescription examinations) {
		object.add(examinations);
	}
	@Override
	public void saveTreatment(Treatment examinations) {
		object.add(examinations);
	}
	@Override
	public void saveVaccine(Vaccine examinations) {
		object.add(examinations);
	}
	
	
	@Override
	public void saveVisit(Visit v) {
		
		visit.setDateTime(v.getDateTime());
		visit.setObservation(v.getObservation());
		visit.setReason(v.getReason());
		visit.setVisitType(v.getVisitType());
		
		
		visitRepository.save(visit);
		
	}


	
	@Override
	public Examinations getExam(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
