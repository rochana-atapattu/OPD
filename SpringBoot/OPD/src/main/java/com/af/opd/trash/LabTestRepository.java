package com.af.opd.trash;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.af.opd.model.LabTest;

public interface LabTestRepository extends MongoRepository<LabTest, String>{

}
