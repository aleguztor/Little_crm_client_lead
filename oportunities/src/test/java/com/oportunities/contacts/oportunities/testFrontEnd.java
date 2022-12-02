package com.oportunities.contacts.oportunities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class testFrontEnd {
	
	private static ChromeDriver driver;
	WebElement element;
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/alejandro.guzman/downloads/chromedriver.exe");
		 driver = new ChromeDriver();
       
		} 
	

	@Test
     public void valid_UserCredential(){
		 driver.get("http://localhost:3000/");	
		 driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("solera@solera.com");
		 driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("solera");
		 driver.findElement(By.xpath("/html/body/div/div/form/input[3]")).click();
		 assertEquals(driver.getCurrentUrl(), "http://localhost:3000/menu");
	}
	@Test
    public void addContacto(){
		 driver.get("http://localhost:3000/");	
		 driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("solera@solera.com");
		 driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("solera");
		 driver.findElement(By.xpath("/html/body/div/div/form/input[3]")).click();
		 assertEquals(driver.getCurrentUrl(), "http://localhost:3000/menu");
		 driver.findElement(By.xpath("/html/body/div/form/div[1]/input")).sendKeys("Alejandro");
		 driver.findElement(By.xpath("/html/body/div/form/div[2]/input")).sendKeys("Guzman");
		 driver.findElement(By.xpath("/html/body/div/form/div[3]/input")).sendKeys("323432343");
		 driver.findElement(By.xpath("/html/body/div/form/div[4]/input")).sendKeys("Aleguzmanillo@gmail.com");
		 driver.findElement(By.xpath("/html/body/div/form/div[5]/button")).click();
		 
	}
	@Test
    public void logOut(){
		 driver.get("http://localhost:3000/");	
		 driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("solera@solera.com");
		 driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("solera");
		 driver.findElement(By.xpath("/html/body/div/div/form/input[3]")).click();
		 assertEquals(driver.getCurrentUrl(), "http://localhost:3000/menu");
		 driver.findElement(By.xpath("/html/body/div/div[3]/button")).click();
		 assertEquals(driver.getCurrentUrl(), "http://localhost:3000/");
	}
	

}
