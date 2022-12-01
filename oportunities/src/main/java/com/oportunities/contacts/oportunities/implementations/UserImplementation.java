package com.oportunities.contacts.oportunities.implementations;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oportunities.contacts.oportunities.entity.User;
import com.oportunities.contacts.oportunities.interfaces.UserService;
import com.oportunities.contacts.oportunities.repositories.UserRepository;

@Service
public class UserImplementation implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findById(Long id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public User userNew(User user) {
		Date ahora = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
		user.setNumberOfCalls(0);
		user.setDate(formateador.format(ahora));
		user.setOportunidad(false);
		user.setCliente(false);
		user.setContacto(true);
		return userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		
		return userRepository.findAll();
	}
//CONVERTIR LA CLASE USUARIO A OPORTUNIDAD CON UN SIMPLE BOOL DENTRO DE LA ENTIDAD
	@Override
	public User userChangeToOportunity(User user,String tipoDeOportunidad) {
		
		userRepository.delete(user);
		
	user.setOportunidad(true);
	user.setOportunityType(tipoDeOportunidad);
	
		return userRepository.save(user);
	}
	@Override
	public User userChangeToClient(User user,String tipoDeCliente) {
		userRepository.delete(user);
	user.setCliente(true);
	user.setOportunityType(tipoDeCliente);
	
		 return userRepository.save(user);
	}

	@Override
	public User plusCall(User user) {
		user.setNumberOfCalls(user.getNumberOfCalls()+1);
		return user;
	}

	@Override
	public void deleteUser(Long Id) {
		userRepository.deleteById(Id);
		
	}

	
	
}
