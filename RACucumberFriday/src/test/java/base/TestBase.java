package base;
import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class TestBase {
	@BeforeClass
	public void setUp() {
		RestAssured.baseURI=utils.ConfigReader.getBaseUrl();
	}
}
