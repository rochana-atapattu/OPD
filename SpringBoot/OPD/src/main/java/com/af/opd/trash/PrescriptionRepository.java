package com.af.opd.trash;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.af.opd.model.Prescription;

public interface PrescriptionRepository extends MongoRepository<Prescription, String>{

}
