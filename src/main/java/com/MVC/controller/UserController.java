package com.MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MVC.dao.UserDao;
import com.MVC.model.User;
import com.MVC.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	public UserRepository userRepository;

	@RequestMapping("/user")
	public String form(Model model, @ModelAttribute("User") User user) {

		User userUtils = userRepository.findByUser(user.getUser());		
		
		if (userUtils != null) {
			String userName = new String(userUtils.getUser());
			String userPassword = new String(userUtils.getPassword());

			if ((userName.equals(user.getUser()) && (userPassword.equals(user.getPassword())))) {
				return "redirect:/listaEventos";
			} 
		}
		model.addAttribute("error", "Usuario ou senha invalido!!!");	
		return "redirect:/";
		}
	
	
	
	@RequestMapping("/userSave")
	public String cadastrar(Model model, @ModelAttribute("User") User user) {		
		UserDao userDao = new UserDao();
		userDao.Salvar(user);		
		userRepository.save(user);
		return "/cadastrarUser";
	}
	
	@RequestMapping("/cadastrarUser")
		public String cadastraUserForm() {
			return "/cadastrarUser";
		}
	
	
	}
	
	
	
	
	
	
	
	
	
	

