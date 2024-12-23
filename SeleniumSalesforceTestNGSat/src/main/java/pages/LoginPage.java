package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	private By usernameField = By.id("username");
	private By passwordField = By.id("password");
	private By loginButton=By.id("Login");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void login (String username,String password) {
		driver.findElement(usernameField).sendKeys("azarriju88-vd7d@force.com");
		driver.findElement(passwordField).sendKeys("Azar~!@#4");
		driver.findElement(loginButton).click();
	}
}
