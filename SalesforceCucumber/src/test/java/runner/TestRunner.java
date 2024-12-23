package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features= "src/test/resources/features",
			glue="steps",
			plugin={"preety","html:target/cucumber-report.html"}
			)
	public class TestRunner
	{
		
	}


