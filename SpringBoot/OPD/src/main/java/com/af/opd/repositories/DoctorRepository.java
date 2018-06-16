package com.af.opd.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.af.opd.domain.Doctor;

public interface DoctorRepository extends MongoRepository<Doctor,String>{

}
