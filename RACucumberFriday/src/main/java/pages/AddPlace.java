package pages;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class AddPlace {
	public Response addPlace (String requestBody,String apiKey) {
		return given().header("Content-Type","application/json")
				.queryParam("key", "qaclick")
				.body(requestBody).when()
				.post(api.Endpoints.ADD_PLACE)
				.then().extract().response();
	}
}
