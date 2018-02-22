package com.udemy.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.udemy.principal.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query("select u from User u where u.name like %?1%")
	User findByQualquerCoisa(String name);

}
