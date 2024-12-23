package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
    By usernameField = By.id("ap_email");
    By continueButton = By.id("continue");
    By passwordField = By.id("ap_password");
    By signInButton = By.id("signInSubmit");
    
    public LoginPage(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public void login(String username,String password)
    {
    	driver.findElement(usernameField).sendKeys("azarriju");
    	driver.findElement(continueButton).click();
        driver.findElement(passwordField).sendKeys("Azar~!@#4");
        driver.findElement(signInButton).click();
    }
}
