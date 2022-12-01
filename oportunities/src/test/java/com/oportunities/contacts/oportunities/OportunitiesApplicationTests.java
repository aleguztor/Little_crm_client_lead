package com.oportunities.contacts.oportunities;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.oportunities.contacts.oportunities.entity.Login;
import com.oportunities.contacts.oportunities.entity.User;

@SpringBootTest
class OportunitiesApplicationTests {

	private User user= new User("Alejandro", "Guzman","Aleguzmanillo@gmail.com",626591157);
	private Login login= new Login("solera@solera.com","solera231");
	private String emaillogin="solera@solera.com";
	private String password="solera231";

	@Before
	public void setup() {
		
		user.setOportunidad(false);
		
		
		login.setLogedstatus(false);
		
	}
	@Test
	public void testOportunidadCreadaExitosamente() {
		user.setOportunidad(true);
		user.setOportunityType("TENEMOS A UN CHICO QUE BUSCA X COSA");
		assertEquals(user.isOportunidad(), true);
		
		
	}
	@Test
	public void loginTry() {
		
		login.setLogedstatus(true);
		assertEquals(emaillogin, login.getEmail());
		assertEquals(password, login.getPassword());
		assertEquals(login.isLogedstatus(), true);
		
	}
	

}
