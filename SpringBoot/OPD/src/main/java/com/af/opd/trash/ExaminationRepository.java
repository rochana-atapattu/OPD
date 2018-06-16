package com.af.opd.trash;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.af.opd.model.Examinations;

public interface ExaminationRepository extends MongoRepository<Examinations, String>{

}
