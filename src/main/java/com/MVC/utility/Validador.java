package com.MVC.utility;

public interface Validador<T> {

	void valida(T objeto) throws ValidadorExpection;

}
