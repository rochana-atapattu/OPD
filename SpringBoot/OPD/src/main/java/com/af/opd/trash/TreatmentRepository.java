package com.af.opd.trash;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.af.opd.model.Treatment;

public interface TreatmentRepository extends MongoRepository<Treatment, String>{

}
