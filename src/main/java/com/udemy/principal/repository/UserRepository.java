package com.udemy.principal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.udemy.principal.entity.User;

public interface UserRepository extends MongoRepository<User, Long> {
	
	
	User findByEmail(String email);
		
	User findByNameIgnoreCaseLike(String name);

}
