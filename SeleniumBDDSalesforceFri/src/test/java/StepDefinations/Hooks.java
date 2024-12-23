package StepDefinations;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ExtentReportManager;

public class Hooks {
	@Before
	public void setup() {
extent= ExtentReportManager.createInstance();
	}
	@After
	public void tearDown()
	{
		extent.flush();
	}
}
