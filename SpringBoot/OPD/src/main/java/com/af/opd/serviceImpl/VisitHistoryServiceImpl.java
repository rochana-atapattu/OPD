package com.af.opd.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.af.opd.domain.PatientRecords;
import com.af.opd.model.Examinations;
import com.af.opd.model.LabTest;
import com.af.opd.model.PatientHistory;
import com.af.opd.model.Prescription;
import com.af.opd.model.Treatment;
import com.af.opd.model.Vaccine;
import com.af.opd.model.Visit;
import com.af.opd.repositories.PatientRecordRepository;
import com.af.opd.service.VisitHistoryService;
import com.af.opd.trash.VisitRepository;

@Service
public class VisitHistoryServiceImpl implements VisitHistoryService{

	@Autowired
	VisitRepository visitRepository;

	@Autowired
	PatientRecordRepository patientRecord;

	@Override
	public String getVisitHistory() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PatientHistory visitHistory(String pId){
		
		Optional<PatientRecords> record=patientRecord.findById(pId);
		List<Visit> visits;
		List<Examinations> exam = new ArrayList<>();
		List<LabTest> labTest = new ArrayList<>();
		List<Prescription> pres = new ArrayList<>();
		List<Treatment> treat = new ArrayList<>();
		List<Vaccine> vaccine = new ArrayList<>();
		
		if(record.isPresent()) {
			visits=record.get().getVist();
			
			for(Visit v:visits){
	
				if(!(v.getExam()==null)) {
					exam.add(v.getExam());
				}
				if(!(v.getLabTest()==null)) {
					labTest.add(v.getLabTest());
				}
				if(!(v.getPrescription()==null)) {
					pres.add(v.getPrescription());
				}
				if(!(v.getTreatment()==null)) {
					treat.add(v.getTreatment());
				}
				if(!(v.getVaccine()==null)) {
					vaccine.add(v.getVaccine());
				}
			}
			PatientHistory p=new PatientHistory(exam, labTest, pres, treat, vaccine);
			
			return p;
		}
		else
			return null;
		
		
	}
	
	
}
