package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

	@FindBy(xpath="//button[@class='slds-button slds-button_neutral slds-button_first']")
	private WebElement newAccountButton;
	
	@FindBy(xpath="//input[@id='input-222']")
	private WebElement AccountInputField;
	
	@FindBy(css=".slds-button.slds-button_brand")
	private WebElement saveButton;
	
	
	public AccountPage(WebDriver driver) {
		super(driver);
	}
	
	public void createAccount(String accountName)
	{
		newAccountButton.click();
		AccountInputField.sendKeys("TestAzar");
		saveButton.click();
	}

	

}
