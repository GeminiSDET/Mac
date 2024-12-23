package pages;
import io.restassured.response.Response;

public class AddPlaceAPIPage extends BasePage {
	public Response addPlace(String payload) //Method Declaration used to encapsulate the logic for sending an HTTP request to add a place
	{
		return requestSpec.body(payload).when()
				.post("maps/api/place/get/json");
	}
}
