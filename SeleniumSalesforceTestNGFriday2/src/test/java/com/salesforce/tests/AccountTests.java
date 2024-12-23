package com.salesforce.tests;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.AccountPage;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;

public class AccountTests extends BaseTest{

	LoginPage loginPage;
	AccountPage accountpage;
	HomePage homepage;
	
	@BeforeMethod
	public void setUpTest() {
		setup();
		loginPage= new LoginPage(driver);
		homepage=new HomePage(driver);
		accountpage=new AccountPage(driver);
	}
	
	@Test
	public void testAccountCRUD() {
		
		loginPage.login("azarriju88-vd7d@force.com", "Azar~!@#4");
		Assert.assertTrue(homepage.VerifyHomePage(),"Login failed!");
		
		
		accountpage.navigateToAccounts();
		accountpage.createAccount();
		Assert.assertTrue(driver.getPageSource().contains("TestAzar"),"Account creation failed!");
			
	}
	
	@AfterMethod
	public void tearDownTest() {
		tearDown();
	}
	
	
	
	
	
	
}
