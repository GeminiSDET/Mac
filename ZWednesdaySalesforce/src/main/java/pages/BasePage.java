package pages;
import org.openqa.selenium.WebDriver;

public class BasePage {
	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void navigateToUrl(String url)
	{
		driver.get(null);
	}
}
