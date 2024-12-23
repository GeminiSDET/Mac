package pageObjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class LoginPage {

	private final String loginEndpoint="auth/login";
	public Response login(String username,String password){
		
		RestAssured.baseURI=utils.ConfigReader.BASE_URL;
		return given().header("Content-Type","application/json")
				.body("{\"userEmail\": \""+username+"\",\n"
						+ "    \"userPassword\": \""+password+"\"}")
				.when().post(loginEndpoint)
				.then().extract().response();
	}
}
