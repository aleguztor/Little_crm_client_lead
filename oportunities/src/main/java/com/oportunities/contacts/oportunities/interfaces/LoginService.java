package com.oportunities.contacts.oportunities.interfaces;

import java.util.List;

import com.oportunities.contacts.oportunities.entity.Login;
import com.oportunities.contacts.oportunities.entity.User;

public interface LoginService {

	
	public List<Login> findAll();
	public Login loginNew(Login user); 
	public Login logIn(Login log);
	public Login logOut(Login log);

}
