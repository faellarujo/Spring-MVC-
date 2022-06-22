package com.MVC.utility;

public class UserValidador implements Validador<String> {

	@Override
	public void valida(String user) throws ValidadorExpection {
		if (user == "!" || user == "@" || user == "#" || user == "$") {
			throw new ValidadorExpection("Caracteres invalidos no usuario");
		} 		
	}

}
