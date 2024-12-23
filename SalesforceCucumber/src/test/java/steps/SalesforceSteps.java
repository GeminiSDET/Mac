package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.WebDriverManager;

public class SalesforceSteps {

	WebDriver driver= WebDriverManager.getDriver();
	LoginPage loginPage=new LoginPage(driver);
	AccountPage accountPage= new AccountPage(driver);
	
	@Given("I launch the Salesforce login page")
	public void launchSalesforceLoginPage()
	{
		driver.get(ConfigReader.get("url"));
	}
	
	@When("I login with valid credentials")
	public void loginWithValidCredentials()
	{
		String username= ConfigReader.get("username");
		String password=ConfigReader.get("password");
		loginPage.login(username, password);
	}
	 @Then("I should see the Salesforce home page")
	    public void verifyHomePage() {
	        Assert.assertTrue(loginPage.isLoggedIn(), "Failed to login to Salesforce.");
	    }

	    @When("I create a new account with name {string} and industry {string}")
	    public void createNewAccount(String accountName, String industry) {
	        accountPage.createAccount(accountName, industry);
	    }

	    @Then("I should see the account created successfully")
	    public void verifyAccountCreation() {
	        Assert.assertTrue(accountPage.isAccountCreated(), "Account creation failed.");
	    }

	    @And("I attach two files to the account")
	    public void attachFilesToAccount() {
	        accountPage.attachFiles();
	    }

	    @Then("I validate the uploaded files")
	    public void validateUploadedFiles() {
	        Assert.assertTrue(accountPage.validateFiles(), "File validation failed.");
	    }

	    @And("I delete one of the files")
	    public void deleteFileFromAccount() {
	        accountPage.deleteFiles();
	    }

	    @When("I update the account's industry to {string}")
	    public void updateAccountIndustry(String industry) {
	        accountPage.updateIndustry(industry);
	    }

	    @Then("the account should have the updated industry")
	    public void verifyUpdatedIndustry() {
	        Assert.assertTrue(accountPage.isIndustryUpdated(), "Account industry update failed.");
	    }

	    @When("I delete the account")
	    public void deleteAccount() {
	        accountPage.deleteAccount();
	    }

	    @Then("the account should no longer exist in the account list")
	    public void verifyAccountDeletion() {
	        Assert.assertFalse(accountPage.isAccountPresent(), "Account deletion failed.");
	    }
	
	
	

}
