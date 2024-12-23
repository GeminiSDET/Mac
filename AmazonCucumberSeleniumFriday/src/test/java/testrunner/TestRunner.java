package testrunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/Amazon.feature",
		glue = "stepDefinations"
		
		)
public class TestRunner {

}
