package com.MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	
	
		@GetMapping("/login")
		public String logintela() {
			return "Evento/login";
			
		}
		
	}
	
