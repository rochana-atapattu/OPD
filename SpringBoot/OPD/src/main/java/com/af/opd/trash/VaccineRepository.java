package com.af.opd.trash;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.af.opd.model.Vaccine;

public interface VaccineRepository extends MongoRepository<Vaccine, String>{

}
