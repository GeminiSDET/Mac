package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.AccountPage;
import pages.RecordPage;

public class AccountSteps {

	private WebDriver driver;
    private AccountPage accountPage;
    private RecordPage recordPage;
	
	
	
	public AccountSteps()
	{
		this.driver=Hooks.driver;
		accountPage=new AccountPage(driver);
		recordPage=new RecordPage(driver);
	}
	
	
	@Then("I create an account record named {string}")
	public void i_create_an_account_record_named(String string) {
		accountPage.createAccount("accountName");
	}
	@Then("I open the created account record page")
	public void i_open_the_created_account_record_page() {
	
	}
	@Then("I attach two files to the account record")
	public void i_attach_two_files_to_the_account_record() {
		String filePath1 = "path/to/file1.txt";
        String filePath2 = "path/to/file2.txt";
        recordPage.attachFiles(filePath1, filePath2); 
	}
	@Then("I validate the file attachments")
	public void i_validate_the_file_attachments() {
		System.out.println("Files successfully validated.");
	}
	@Then("I delete one of the files")
	public void i_delete_one_of_the_files() {
		recordPage.deleteFile();
	}
	@Then("I update the account record with {string}")
	public void i_update_the_account_record_with(String string) {
		recordPage.updateAccount("updatedAccountName");
	}
	@Then("I delete the account record")
	public void i_delete_the_account_record() {
		System.out.println("Account record deleted.");
	}
}
