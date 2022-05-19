package com.MVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MVC.repository.EventoRepository;

@RestController
public class ListaEventos {
	
	
	@Autowired
	public EventoRepository eventoRepository;
	
	
	@GetMapping("/listarEventos")
	public String teste() {
		return "Spring Boot";
	}

}
