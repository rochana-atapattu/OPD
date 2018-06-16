package com.af.opd.trash;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.af.opd.domain.PatientRecords;
import com.af.opd.model.Visit;

public interface VisitRepository extends MongoRepository<Visit, String>{
	
	public List<Visit> findAll();

	

}
