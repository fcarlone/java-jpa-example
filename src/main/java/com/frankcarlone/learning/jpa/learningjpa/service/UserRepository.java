package com.frankcarlone.learning.jpa.learningjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frankcarlone.learning.jpa.learningjpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
