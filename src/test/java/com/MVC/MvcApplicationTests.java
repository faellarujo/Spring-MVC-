package com.MVC;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.MVC.model.User;
import com.MVC.repository.UserRepository;

@SpringBootTest
class MvcApplicationTests {

	
	@Autowired
	UserRepository userRepository;
	
	
		
	
	
	@Test
	@Disabled
	void findById() {
		User user = new User();		
		Optional<User> findById = userRepository.findById(45L);		
		user = findById.get();
		System.out.println(user.toString());
		
	}	
	
	@Test
	@Disabled
	void ListUserfindall() {				
		Iterable<User> findAll = userRepository.findAll();		
		for (User listuser : findAll) {
			System.out.println(listuser.toString());
		}
	}
	
	@Test
	@Disabled
	void deleteUser() {				
		Optional<User> findById = userRepository.findById(45L);
		User user = new User();
		user = findById.get();
		userRepository.delete(user);
		System.out.println("Usuario Deletado");
	}
	
	@Test
	@Disabled
	void UpdateUser() {		
	}

}
