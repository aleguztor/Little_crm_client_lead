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

import com.oportunities.contacts.oportunities.entity.Login;
import com.oportunities.contacts.oportunities.entity.User;
import com.oportunities.contacts.oportunities.interfaces.LoginService;
import com.oportunities.contacts.oportunities.interfaces.UserService;
import com.oportunities.contacts.oportunities.repositories.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
public class LoginController {
	
	private static List<Login> users = new ArrayList<Login>();
	
	@Autowired
	LoginRepository repository;
	
	@Autowired
	LoginService service;
	
	
	

	
	@GetMapping("/loggers")
	public ResponseEntity<?> getLoggers() {
	    
	    List<Login> getLoggers = service.findAll();

	    return new ResponseEntity(getLoggers, HttpStatus.OK);
	}
	
	@PostMapping("/loggers")
	public Login createLogger(@RequestBody Login logger) {
	    
	    Login newlog=service.loginNew(logger);

	    return newlog;
	}

	 @PutMapping("/login")
	    public Login logOutUser(@RequestBody Login userModel) {
	       
	        Login userSaved = service.logIn(userModel);
	        
	       // return the saved data and an Okay.
	        return userSaved;
	    }
	 @PutMapping("/logout")
	    public Login logInUser(@RequestBody Login userModel) {
	       
	        Login userSaved = service.logOut(userModel);
	        
	       // return the saved data and an Okay.
	        return userSaved;
	    }
	 
	 @DeleteMapping("/loggers/{id}")
	 public void deleteUser(@PathVariable Long id) {
		 repository.deleteById(id) ;
	 }
}
