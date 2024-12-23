package stepDefinations;
import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ExtentReportManager;

public class Hooks {
	public static ExtentReports extent;
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
