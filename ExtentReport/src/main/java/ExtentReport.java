import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		//ExtentReports,ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Web Automation Result Doc.");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Azar");
	}	
	@Test
	public void initialDemo() 
	{
		ExtentTest test=extent.createTest("Initiate url");
		
		System.setProperty("webdriver.chrome.driver", "/Users/azarahmed/Desktop/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		driver.close();
		
		test.fail("Result do not match");
		extent.flush();
		//driver.quit();
	}
}
