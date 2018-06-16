package com.af.opd.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.af.opd.domain.PatientRecords;
import com.af.opd.model.PatientRecordForm;
import com.af.opd.model.Visit;
import com.af.opd.repositories.PatientRecordRepository;
import com.af.opd.service.PatientRecordService;


@Service
public class PatientRecordServiceImpl implements PatientRecordService{

	@Autowired
	PatientRecordRepository patientRecordRepository;
	@Override
	public String addPatientRecord(PatientRecordForm patient) {
		
		Optional<PatientRecords> p=patientRecordRepository.findById(patient.getId());
		if(p.isPresent()) {
			PatientRecords pa=new PatientRecords();
			List<Visit> vists=p.get().getVist();
			vists.add(patient.getVisit());
			pa.setPatientId(patient.getId());
			pa.setVist(vists);
			patientRecordRepository.save(pa);
			return "updated";
		}
		else {
			List<Visit> visit=new ArrayList<>();
			visit.add(patient.getVisit());
			PatientRecords pa=new PatientRecords(patient.getId(), visit);
		patientRecordRepository.save(pa);
		return "saved";
		}
	}

	@Override
	public String getPatientRecord() {
		// TODO Auto-generated method stub
		return null;
	}

}
