package com.MVC.model;

public class VerificaUsuarioLogado {
	
	public boolean verificaLogin(User user) {		
		boolean usuarioLogado;	
		usuarioLogado = (user.login == true) ? true : false;		
		return usuarioLogado;
	    }		
}
