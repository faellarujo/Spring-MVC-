package com.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MVC.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUser(String user);
	public User findBypassword(String password);
	
	
}
