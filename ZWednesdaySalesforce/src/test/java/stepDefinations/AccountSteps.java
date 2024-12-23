package stepDefinations;

import io.cucumber.java.en.When;
import pages.AccountPage;

public class AccountSteps {

	AccountPage accountPage;
	
	 @When("User creates an account with name {string}")
	    public void user_creates_an_account_with_name(String accountName) {
	        accountPage.createAccount(accountName);
	 }
}
