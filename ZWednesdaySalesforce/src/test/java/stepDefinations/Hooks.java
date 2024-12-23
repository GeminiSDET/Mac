package stepDefinations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import pages.BasePage;
import utils.ExtentManager;

public class Hooks {
	WebDriver driver;
    BasePage basePage;

    @BeforeMethod
	public void setup() {
        driver = new ChromeDriver();
        basePage = new BasePage(driver);

        ExtentManager.startTest("Salesforce Automation Test");
        ExtentManager.logTestInfo("Test started successfully.");
    }
    @AfterMethod
	public void tearDown() {
        if (driver != null) {
            ExtentManager.logTestInfo("Test completed.");
            ExtentManager.endTest();  // End the Extent test and flush the report
            driver.quit();
        }
    }
}
