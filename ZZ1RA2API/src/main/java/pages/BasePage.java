package pages;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BasePage {
	public RequestSpecification requestSpec; //allows you to define common request details (like headers, base URL, authentication, etc.) that can be reused across multiple requests
	public BasePage()  //Constructor
	{
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		RestAssured.given().queryParam("Key", "qaclick123")
		.header("Content-Type","application/json");
	}
}
