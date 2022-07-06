package com.MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {	
	
	@GetMapping("/")
	public String imprime() {
		return "index";
		}
	
	@GetMapping("/login")
	public String imprime1() {
		return "login";
		}
	
	
	
	
	}


