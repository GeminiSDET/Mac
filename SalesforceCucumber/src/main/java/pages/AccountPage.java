package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

	WebDriver driver;
	
	By accountTab = By.xpath("//a[@title='Accounts']");
	By newButton = By.xpath("//button[@title='New']");
	By accountNameField= By.xpath("//input[@name='Name']");
	By industryDropdown= By.xpath("//lightning-combobox[@name='Industry']");
	By saveButton=By.xpath("//button[@name='SaveEdit']");
	
	By successToast=By.xpath("//span[contains(@class, 'toastMessage')]");
	
	By filesTab= By.xpath("//span[@title='Files']");
	
	By uploadFileButton=By.xpath("//button[@title='Upload Files']");

	public AccountPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void createAccount(String name,String industry)
	{
		driver.findElement(accountTab).click();
		driver.findElement(newButton).click();
		driver.findElement(accountNameField).sendKeys(name);
		driver.findElement(industryDropdown).sendKeys(industry);
		driver.findElement(saveButton).click();
	}
	
	public boolean isAccountCreated()
	{
		return driver.findElements(successToast).size()>0;
	}
	
	public void attachFiles()
	{
		driver.findElement(filesTab).click();
		// Logic to upload files
	}
	
	public boolean validateFiles()
	{
        // Logic to validate uploaded files
		return true;
	}
	
	public void deleteFiles()
	{
        // Logic to delete a file
	}
	
	public void updateIndustry(String industry)
	{
        // Logic to update industry
	}
	
	public boolean isIndustryUpdated()
	{
        // Logic to verify industry update
		return true;
	}
	
	public void deleteAccount()
	{
		//Logic to delete Account
	}
	
	public boolean isAccountPresent()
	{
        // Logic to verify account presence
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
