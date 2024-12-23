package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	
	@BeforeMethod
	public void setUp() {
		initializeDriver();
		driver.get("https://login.salesforce.com");
	}

	@Test
	public void testLogin() {
		LoginPage loginPage =new LoginPage(driver);
		loginPage.login("azarriju88-vd7d@force.com", "Azar~!@#4");
		assert driver.getTitle().contains("Home Page");
	}
	
	
	@AfterMethod
	public void tearDown() {
		quitDriver();
	}
	
}
