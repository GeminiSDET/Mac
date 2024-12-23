package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
/*
 * 1. https://rahulshettyacademy.com/api/ecom/auth/login

Write a Rest Assured simple Cucumber framework using POM using Java including JUnit for Assertion 
Include Test Runner 
Execute the complete end to end scenerios
 */
public class LoginStepDefinations {

	private String authToken;
	@Given("I login with valid credentials")
	public void i_login_with_valid_credentials() {
		LoginPage loginPage =new LoginPage();
		authToken=loginPage.login("azarriju88@gmail.com", "Azar~!@#4");
	    
	}
	@Then("I should receive a valid token")
	public void i_should_receive_a_valid_token() {
		assertNotNull("Token should not be Null",authToken);
		assertTrue("Token should be a non-empty string",!authToken.isEmpty());
	   
	}
}
