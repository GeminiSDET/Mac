package pages;

import base.BaseClass;
import io.restassured.response.Response;
import pojo.LoginRequest;
import static io.restassured.RestAssured.given;

public class AuthPage extends BaseClass {
	public Response login(String userEmail,String userPassword){
		
		LoginRequest request =new LoginRequest(userEmail,userPassword);
		return given().header("Content-Type", "application/json")
				.body(request)
				.when()
				.post("api/ecom/auth/login");
		
	}

	
}
