package com.salesforce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	WebDriver driver;
	
	@FindBy(xpath="//a[@title='Accounts']")
	WebElement accountTab;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement newAccountButton;
	
	@FindBy(xpath="//input[@id='input-506']")
	WebElement accountNameField;
	
	@FindBy(css="button[name='SaveEdit']")
	WebElement saveButton;
	
	
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToAccounts() {
		accountTab.click();
	}
	
	public void createAccount() {
	newAccountButton.click();
	accountNameField.sendKeys("TestAzar");
	saveButton.click();
	}
	
	
	
	
	
	
	
}
