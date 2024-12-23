package Base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	protected WebDriver driver;
	
	public void initializeDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void quitDriver() {
		if (driver !=null) {
			driver.quit();
		}
	}
}
