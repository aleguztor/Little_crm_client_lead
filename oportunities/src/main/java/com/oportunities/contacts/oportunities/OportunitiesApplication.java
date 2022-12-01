package com.oportunities.contacts.oportunities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oportunities.contacts.oportunities.entity.Login;

@SpringBootApplication
public class OportunitiesApplication {

	public static void main(String[] args) {
		
		//Login log= new Login("solera@solera.com","solera");
		
		SpringApplication.run(OportunitiesApplication.class, args);
		
	}

}
