package utils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	public static ExtentReports extent;
	public static ExtentReports createInstance() {
		
		String reportPath=System.getProperty("user.dir")+"/reports/index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportPath);
		
		reporter.config().setReportName("API Test Report");
		reporter.config().setDocumentTitle("API test Report Doc");
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Azar");
		return extent;
	}
}
