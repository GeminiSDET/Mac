package utils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	  private static ExtentReports extent;
	    private static ExtentTest test;
	    
	    private static final String REPORT_PATH = "target/ExtentReport.html";

	    public static ExtentReports getReporter() {
	        if (extent == null) {
	            ExtentSparkReporter htmlReporter = new ExtentSparkReporter(REPORT_PATH);
	            htmlReporter.config().setDocumentTitle("Salesforce Automation Report");
	            htmlReporter.config().setReportName("Salesforce Automation Test Execution");
	            htmlReporter.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.STANDARD);

	            // Creating the ExtentReports instance and attaching the HTML reporter
	            extent = new ExtentReports();
	            extent.attachReporter(htmlReporter);
	        }
	        return extent;
	    }
	    public static ExtentTest startTest(String testName) {
	        test = getReporter().createTest(testName);
	        return test;
	    }
	    public static void endTest() {
	        extent.flush();
	    }
	    public static void logTestInfo(String message) {
	        if (test != null) {
	            test.info(message);
	        }
	    }
	    public static void logTestPass(String message) {
	        if (test != null) {
	            test.pass(message);
	        }
	    }
	    public static void logTestFail(String message) {
	        if (test != null) {
	            test.fail(message);
	        }
	    }
	    public static void addScreenshot(String screenshotPath) {
	        if (test != null) {
	            test.addScreenCaptureFromPath(screenshotPath);
	        }
	    }
}
