package com.frankcarlone.learning.jpa.learningjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.frankcarlone.learning.jpa.learningjpa.entity.User;
import com.frankcarlone.learning.jpa.learningjpa.service.UserDAOService;
import com.frankcarlone.learning.jpa.learningjpa.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	// Logger
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// Add user
		User user = new User("Jill", "Admin");
		// Save user
		userRepository.save(user);
		
		log.info("New User is created: " + user);
	}
	
}
