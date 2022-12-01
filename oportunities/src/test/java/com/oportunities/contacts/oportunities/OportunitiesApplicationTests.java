package com.oportunities.contacts.oportunities;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.oportunities.contacts.oportunities.entity.User;

@SpringBootTest
class OportunitiesApplicationTests {

	private User user= new User("Alejandro", "Guzman","Aleguzmanillo@gmail.com",626591157);
	

	@BeforeClass
	public void setup() {
		user.setOportunidad(false);
		
	}
	@Test
	public void testOportunidadCreadaExitosamente() {
		user.setOportunidad(true);
		user.setOportunityType("TENEMOS A UN CHICO QUE BUSCA X COSA");
		assertEquals(user.isOportunidad(), true);
		
		
	}

}
