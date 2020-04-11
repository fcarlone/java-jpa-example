package com.frankcarlone.learning.jpa.learningjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.frankcarlone.learning.jpa.learningjpa.entity.User;
import com.frankcarlone.learning.jpa.learningjpa.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	// Logger
	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		// Add user
		User user = new User("Jack", "Admin");
		// Save user
		long insert = userDaoService.insert(user);
		
		log.info("New User is created: " + user);
	}
	
}
