package com.oportunities.contacts.oportunities.interfaces;

import java.util.List;

import com.oportunities.contacts.oportunities.entity.User;

import ch.qos.logback.core.joran.action.Action;

public interface UserService {

	public List<User> findAll();
	public User findById(Long id);
	
	public User userNew(User user);
	public User userChangeToOportunity(User user,String text);
	public User userChangeToClient(User user,String text);
	public User plusCall(User user);
	public void deleteUser(Long Id);
	
}

