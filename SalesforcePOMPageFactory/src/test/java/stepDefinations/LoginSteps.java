package stepDefinations;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

	private WebDriver driver;
	private LoginPage loginPage;
	
	public LoginSteps()
	{
		this.driver= Hooks.driver;
		loginPage=new LoginPage(driver);
	}
	
	@Given("I am on the Salesforce login page")
	public void i_am_on_the_salesforce_login_page() {
	   driver.get("https://login.salesforce.com");
	}
	
	
	@When("I login using {string} and {string}")
	public void i_login_using_and(String username, String password) {
	    loginPage.login(username, password);
	}
	
}
