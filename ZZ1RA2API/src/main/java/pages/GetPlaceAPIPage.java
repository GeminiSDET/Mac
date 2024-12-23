package pages;
import io.restassured.response.Response;

public class GetPlaceAPIPage extends BasePage{
	public Response getPlace(String placeId)
	{
	return requestSpec.queryParam("place_id", placeId)
				.when().get("maps/api/place/get/json");
	}
}
