package com.MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	
/*	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView md = new ModelAndView("index");	
		md.addObject(md);				
		return md;
	}
*/	
	
	@GetMapping("/")
	public String index() {					
		return "index"; 
	}
}
