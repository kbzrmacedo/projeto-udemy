package com.udemy.principal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.udemy.principal.entity.User;
import com.udemy.principal.repository.UserRepository;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		createUser("Matheus", "Matheus.cont");
		createUser("João", "João.teste");
		
	}
	
	public void createUser(String name, String email) {
		User user = new User(name, email);
		
		userRepository.save(user);
	}
}
