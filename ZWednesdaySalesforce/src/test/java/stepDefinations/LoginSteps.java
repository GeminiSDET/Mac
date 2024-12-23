package stepDefinations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ExtentManager;

public class LoginSteps {
	WebDriver driver;
    BasePage basePage;
    LoginPage loginPage;
    ConfigReader configReader;

    @Given("User is on the Salesforce login page")
    public void user_is_on_the_salesforce_login_page() {
        configReader = new ConfigReader();
        
        driver = new ChromeDriver();
        basePage = new BasePage(driver);
        
        basePage.navigateToUrl(configReader.getBaseUrl());
        
        loginPage = new LoginPage(driver);
        
        ExtentManager.logTestInfo("User is on the Salesforce login page.");
    }
    @When("User logs in with username and password")
    public void user_logs_in_with_username_and_password() {
        String username = configReader.getUsername();
        String password = configReader.getPassword();
        
        loginPage.login(username, password);
        
        ExtentManager.logTestInfo("User has entered the username and password and clicked login.");
    }
}
