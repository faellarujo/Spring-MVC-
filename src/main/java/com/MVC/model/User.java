package com.MVC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity
@Getter
@Setter
@ToString
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idUser;
	
	String user;
	String password;
	boolean login = false;	
	
	public User() {
		
	}	

	public User(Long idUser, String user, String password, boolean login) {
		super();
		this.idUser = idUser;
		this.user = user;
		this.password = password;
		this.login = login;
	}
	
	
	
}
