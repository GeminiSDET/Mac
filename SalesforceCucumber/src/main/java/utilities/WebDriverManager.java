package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

	public static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver", "/Users/azarahmed/Desktop/chromedriver");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	public static void quitDriver()
	{
		if(driver!=null);
		driver.quit();
		driver=null;
	}
}


