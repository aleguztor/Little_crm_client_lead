package com.oportunities.contacts.oportunities.controlers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oportunities.contacts.oportunities.entity.User;
import com.oportunities.contacts.oportunities.interfaces.UserService;
import com.oportunities.contacts.oportunities.repositories.*;
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/")
	public ResponseEntity<?> getUser() {
	    
	    List<User> getUser = service.findAll();

	    return new ResponseEntity(getUser, HttpStatus.OK);
	}
	 /*@RequestMapping(value="/", method=RequestMethod.POST)
	    public void  postUser(){
	        return listaUsuarios;
	    }*/
	 @PostMapping("/")
	    public User registerUser(@RequestBody User userModel) {
	        // get the data passed by user/passed to postman
	       	        //save data passed by user
	        User userSaved = service.userNew(userModel);
	        
	       // return the saved data and an Okay.
	        return userSaved;
	    }
	 
	 @GetMapping("/{id}")
		public ResponseEntity<?> getUserById(@PathVariable Long id) {
		    
		 User getUser=  service.findById(id);

		    return new ResponseEntity(getUser, HttpStatus.OK);
		}
	 @PutMapping("/{id}/tipoDeOportunidad/{oportunidad}")
		public ResponseEntity<?> putStateToOportunity(@PathVariable Long id,@PathVariable String oportunidad) {
		    
		 User user =service.findById(id);
		 User getUser=  service.userChangeToOportunity(user, oportunidad);
		 
		    return new ResponseEntity(getUser, HttpStatus.OK);
		}
	 @PutMapping("/{id}/tipoDeCliente/{cliente}")
		public ResponseEntity<?> putStateToClient(@PathVariable Long id,@PathVariable String cliente) {
		    
		 User user =service.findById(id);
		 User getUser=  service.userChangeToClient(user, cliente);

		    return new ResponseEntity(getUser, HttpStatus.OK);
		}
	 @DeleteMapping("/{id}")
	 public void deleteUser(@PathVariable Long id) {
		 service.deleteUser(id);
	 }
}
