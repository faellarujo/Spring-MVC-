package com.MVC.utility;

public class SenhaValidador implements Validador<String> {

	@Override
	public void valida(String senha) throws ValidadorExpection {
		
		// Aqui vai toda a regra da senha
		
		if (senha == null || senha.length() < 3 || senha.length() > 10) {
			throw new ValidadorExpection("A senha deve conter entre 3 e 10 caracteres!!!");
		}		
	}
}
