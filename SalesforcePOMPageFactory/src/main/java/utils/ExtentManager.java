package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class ExtentManager {

	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static ExtentReports createExtentReport()
	{
			ExtentHtmlReporter reporter=new ExtentHtmlReporter("extent-report.html");
			extent =new ExtentReports();
			extent.attachReporter(reporter);
			
	return extent;
}
	
	public static ExtentTest getTest()
	{
		return test;
	}
	
	public static void setTest(ExtentTest test)
	{
		ExtentManager.test=test;
	}
}
