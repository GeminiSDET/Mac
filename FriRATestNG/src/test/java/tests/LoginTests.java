package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;
import pageObjects.LoginPage;

public class LoginTests {

	private LoginPage loginpage;
	
	@BeforeClass
	public void setup() {
		loginpage=new LoginPage();
	}
	
	@Test
	public void testValidLogin() {
		Response response=loginpage.login(utils.ConfigReader.USERNAME,utils.ConfigReader.PASSWORD);
		
		Assertions.assertEquals(200, response.getStatusCode(),"Status code mismatch");
		Assertions.assertNotNull(response.jsonPath().getString("token"),"Token should not be null");
	}
	
	@Test
	public void testInvaildLogin() {
		Response response=loginpage.login("invalid@gmail.com", "wrongpassword");
		Assertions.assertEquals(401, response.getStatusCode(),"Status code mismatch for invalid credentials");
		Assertions.assertEquals("Incorrect email or password",response.jsonPath().getString("mismatch"),"Error message mismatch");
	}
}
