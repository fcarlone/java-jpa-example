package com.frankcarlone.learning.jpa.learningjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Map User to Table (javax.persistence)
@Entity
public class User {
	
//	id is Primary Key and automatically generated
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;
	
//	Default constructor
	public User() {
		
	}
	
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	
}
