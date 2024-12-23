package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(xpath="//input[@type='email']")
	private WebElement usernameField;
	
	@FindBy(xpath="")
	private WebElement passwordField;
	
	@FindBy(xpath="")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login ()
	{
		usernameField.sendKeys("azarriju88-vd7d@force.com ");
		passwordField.sendKeys("Azar~!@#4");
		loginButton.click();
	}

	
}
