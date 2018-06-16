package com.af.opd.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.af.opd.domain.User;

public interface UserRepository extends MongoRepository<User, UUID>{

	User findByName(String username);
	
	

	boolean existsByUsername(String username);

	User findById(String id);



	User findByUsername(String string);

}
