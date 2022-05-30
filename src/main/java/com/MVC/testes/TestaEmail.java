package com.MVC.testes;

import com.MVC.utility.SendEmail;

public class TestaEmail {

	public static void main(String[] args) {		
		
		SendEmail sendEmail = new SendEmail();
		
		//Message remetente;
		//Address[] toUser;
		
		//remetente = sendEmail.getRemetente();
		//toUser = sendEmail.getToUser();		
		sendEmail.enviandoMesansagem(sendEmail.getRemetente(), sendEmail.getToUser(), "Cabeçalho", "Assunto do email");
		
	}

}
