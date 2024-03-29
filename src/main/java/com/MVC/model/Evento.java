package com.MVC.model;

import java.io.Serializable;

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
public class Evento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;	
	private String nome;
	private String local;	
	private String data;
	private String horario;
	
}
