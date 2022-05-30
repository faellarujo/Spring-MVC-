package com.MVC.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.MVC.model.Evento;
import com.MVC.repository.EventoRepository;
import com.MVC.utility.SendEmail;

@Controller
public class EventoController {

	@Autowired
	public EventoRepository eventoRepository;

	@GetMapping("/cadastrarEvento")
	public String Form() {
		return "Evento/FormEvento";
	}

	@PostMapping("/cadastrarEvento")
	public String Form(Evento evento) {
		eventoRepository.save(evento);
		SendEmail sendEmail = new SendEmail();
		SendEmail.enviandoMesansagem(sendEmail.getRemetente(), sendEmail.getToUser(), "Evento Cadastrado", evento.getNome());		
		return "redirect:/cadastrarEvento";
	}  
	

	@GetMapping("/eventos")
	public ModelAndView FormListaEventos() {
		ModelAndView modelAndView = new ModelAndView("index");
		Iterable<Evento> iterable = eventoRepository.findAll();
		modelAndView.addObject("eventos", iterable);
		return modelAndView;
	}

	@RequestMapping("/{codigo}")
	public ModelAndView detalhesEvento(@PathVariable("codigo") Long codigo) {
		Optional<Evento> ev = eventoRepository.findById(codigo);		
		ModelAndView modelAndView = new ModelAndView("Evento/detalhesEvento");			
		modelAndView.addObject("eventoDetalhes", ev.get());
		return modelAndView;
		}

	
	@RequestMapping("/deletar")
	public String deletaEvento(Long codigo) {
		Optional<Evento> ev = eventoRepository.findById(codigo);
		String nomeEvento = ev.get().getNome();
		SendEmail sendEmail = new SendEmail();
		SendEmail.enviandoMesansagem(sendEmail.getRemetente(), sendEmail.getToUser(), "Evento Deletado", nomeEvento);
		eventoRepository.deleteById(ev.get().getCodigo());			
		return "redirect:/eventos";
		}
	
	
	@RequestMapping("/alterar")
	public ModelAndView alterarEvento(Long codigo) {
		Optional<Evento> ev = eventoRepository.findById(codigo);
		ModelAndView modelAndView = new ModelAndView("Evento/FormEventoAlteracao");		
		modelAndView.addObject("eventos", ev.get());
		return modelAndView;
		}
}


