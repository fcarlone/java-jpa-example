package com.frankcarlone.learning.jpa.learningjpa.service;

import javax.persistence.EntityManager;

import com.frankcarlone.learning.jpa.learningjpa.entity.User;

public class UserDAOService {

	private EntityManager entityManager;
	
//	Save to database method
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
