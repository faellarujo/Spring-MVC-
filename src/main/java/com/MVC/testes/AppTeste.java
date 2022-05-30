package com.MVC.testes;

import org.springframework.beans.factory.annotation.Autowired;

import com.MVC.model.Evento;
import com.MVC.repository.EventoRepository;


public class AppTeste {

	
	@Autowired
	public static EventoRepository eventoRepository;
	
	
	
	public static void main(String[] args) {		
		
		Evento evento = new Evento();
		salva(evento);
		System.out.println("Salva com sucesso");
	}
	
	
	public static void salva(Evento evento) {
		
		evento.setData("data");
		evento.setHorario("horario");
		evento.setLocal("local");
		evento.setNome("nome");		
		eventoRepository.save(evento);
	}
	
	

}


