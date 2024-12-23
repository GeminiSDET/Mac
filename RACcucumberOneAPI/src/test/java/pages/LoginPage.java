package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LoginPage {

	public static final String LOGIN_URL="https://rahulshettyacademy.com/api/ecom/auth/login";
	public String login(String username,String password) {
		String requestBody ="{\n"
				+ "    \"userEmail\": \"azarriju88@gmail.com\",\n"
				+ "    \"userPassword\": \"Azar~!@#4\"\n"
				+ "}";
		Response response=RestAssured.given().header("Content-Type","application/json")
		.body(requestBody)
		.post(LOGIN_URL)
		.then().extract().response();
		
		if(response.statusCode()==200) {
			return response.jsonPath().getString("token");	
		}
		else {
			throw new RuntimeException("Login failed:" + response.getBody().asString());
		}
	}
}
