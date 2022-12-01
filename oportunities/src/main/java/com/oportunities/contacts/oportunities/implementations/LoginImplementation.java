package com.oportunities.contacts.oportunities.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oportunities.contacts.oportunities.entity.Login;
import com.oportunities.contacts.oportunities.interfaces.LoginService;

import com.oportunities.contacts.oportunities.repositories.LoginRepository;


@Service
public class LoginImplementation implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public List<Login> findAll() {
		
		 
		return loginRepository.findAll();
	}

	@Override
	public Login loginNew(Login user) {
		
		user.setLogedstatus(false);
		
		return loginRepository.save(user);
	}

	@Override
	public Login logIn(Login log) {
		loginRepository.delete(log);
		log.setLogedstatus(true);
		
		return loginRepository.save(log);
	}

	@Override
	public Login logOut(Login log) {
		loginRepository.delete(log);
		log.setLogedstatus(false);
		
		return loginRepository.save(log);
		
	}

}
