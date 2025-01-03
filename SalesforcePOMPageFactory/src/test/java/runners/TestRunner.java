package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinitions",
		plugin= {"preety","html:target/cucumber-report.html"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {


}
