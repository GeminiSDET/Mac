package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Base.BaseTest;
import pages.AccountPage;
import pages.LoginPage;

public class AccountTest extends BaseTest{

	
	@BeforeMethod
	public void setUp() {
		initializeDriver();
		driver.get("https://login.salesforce.com");
		
		
		LoginPage loginpage =new LoginPage(driver);
		loginpage.login("azarriju88-vd7d@force.com", "Azar~!@#4");
	}
	@Test
	public void testCreateAccount() {
		AccountPage accountpage =new AccountPage(driver);
		accountpage.openAccountsTab();
		accountpage.createAccount();
		assert driver.getPageSource().contains("AzarTest1");		
	}
	
	
	@AfterMethod
	public void tearDown() {
		quitDriver();
	}
}
