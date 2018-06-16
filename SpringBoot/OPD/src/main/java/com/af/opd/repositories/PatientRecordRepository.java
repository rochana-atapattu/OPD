package com.af.opd.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.af.opd.domain.PatientRecords;

public interface PatientRecordRepository extends MongoRepository<PatientRecords, String>{

}
