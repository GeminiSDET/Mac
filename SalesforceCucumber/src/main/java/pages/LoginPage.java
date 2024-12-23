package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By usernameField= By.id("username");
	By passwordField=By.id("password");
	By loginButton=By.id("Login");
	By homePageIndicator=By.id("homePageIndicator");

	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login (String username,String password)
	{
		driver.findElement(usernameField).sendKeys("azarriju88-vd7d@force.com");
		driver.findElement(passwordField).sendKeys("Azar~!@#4");
		driver.findElement(loginButton).click();
	}
	
	public boolean isLoggedIn()
	{
		return driver.findElements(homePageIndicator).size()>0;
	}	
}
