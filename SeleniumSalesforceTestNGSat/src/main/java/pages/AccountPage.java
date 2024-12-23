package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

	private WebDriver driver;
	
	private By accountTab= By.xpath("a[title=\"Accounts\"]");
	private By newButton=By.cssSelector("button[name='New']");
	private By accountNameField=By.xpath("//input[@id=\"input-1089\"]");
	private By saveButton= By.xpath("//button[@name=\"SaveEdit\"] ");
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void openAccountsTab() {
		driver.findElement(accountTab).click();
	}
	
	public void createAccount() {
		driver.findElement(newButton).click();
		driver.findElement(accountNameField).sendKeys("AzarTest1");
		driver.findElement(saveButton).click();
	}
}
