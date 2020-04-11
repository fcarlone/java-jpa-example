package com.frankcarlone.learning.jpa.learningjpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.frankcarlone.learning.jpa.learningjpa.entity.User;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
//	Save to database method
	public long insert(User user) {
//		Open transaction - @Transactional
		entityManager.persist(user);
		return user.getId();
	}
}
