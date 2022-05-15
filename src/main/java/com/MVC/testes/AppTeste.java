package com.MVC.testes;

import org.springframework.beans.factory.annotation.Autowired;

import com.MVC.repository.EventoRepository;

public class AppTeste {

	
	@Autowired
	public static EventoRepository eventoRepository;
	
	
	public static void main(String[] args) {
		try {
			eventoRepository.findAll().toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void imprime() {
		eventoRepository.findAll();
	}
	

}
