package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	WebDriver driver;
	
	@FindBy(id="Account_Name")
	WebElement accountNameField;
	
	 @FindBy(id = "Save")
	 WebElement saveButton;
	 
	 public AccountPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void createAccount(String accountName)
	 {
		 accountNameField.sendKeys(accountName);
		 saveButton.click();
	 }
}
