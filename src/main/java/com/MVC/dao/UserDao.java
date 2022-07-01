package com.MVC.dao;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.MVC.model.User;
import com.MVC.repository.UserRepository;
import com.MVC.utility.SenhaValidador;
import com.MVC.utility.UserValidador;
import com.MVC.utility.Validador;
import com.MVC.utility.ValidadorExpection;

public class UserDao {

	@Autowired
	public UserRepository userRepository;

	public <T> void valida(Validador<T> validador, T user) {
		try {
			validador.valida(user);
		} catch (ValidadorExpection e) {
			String msg = "Não foi possivel realizar a operação" + e.getMessage();
			System.err.println(msg);
			throw new RuntimeException(msg);
		}
	}

	public void Salvar(User user) {
		valida(new SenhaValidador(), user.getPassword());
		valida(new UserValidador(), user.getUser());
	}

	public void login(User user) {
		try {

			if (Objects.isNull(user)) {
				System.out.println("Objeto esta nullo");
			} else {
				user.setLogin(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void logout(User user) {
		try {

			if (Objects.isNull(user)) {
				System.out.println("Objeto esta nullo");
			} else {
				user.setLogin(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
