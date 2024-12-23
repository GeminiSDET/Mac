package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecordPage extends BasePage {

	@FindBy(xpath=".slds-file-selector__button.slds-button.slds-button_neutral")
	private WebElement attachFilesButton;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement fileInput;
	
	@FindBy(xpath="//button[contains(text(),'Delete File')]")
	private WebElement deletefileButton;
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement editButton;
	
	@FindBy(xpath="//input[@name='Account Name']")
	private WebElement accountNameField;
	
	
	public RecordPage(WebDriver driver) {
		super(driver);
	}
	
	public void attachFiles(String filePath1,String filePath2)
	{
		attachFilesButton.click();
		fileInput.sendKeys(filePath1);
		fileInput.sendKeys(filePath2);
	}
	
	public void deleteFile()
	{
		deletefileButton.click();
	}
	
	public void updateAccount(String updatedName)
	{
		editButton.click();
		accountNameField.clear();
		accountNameField.sendKeys(updatedName);
	}

}
