package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import pages.AddPlaceAPIPage;
import utils.PayLoadBuilder;

public class PlaceAPISteps {
	Response response;
	AddPlaceAPIPage addPlaceAPI=new AddPlaceAPIPage();
	
@Given("I create a new place with name {string} and address {string} and language {string}")
public void i_create_a_new_place_with_name_and_address_and_language(String name, String address, String language) {
    String payload= PayLoadBuilder.buildAddPlacePayload(name, address, language);
   response= addPlaceAPI.addPlace(payload);
}
@When("I send the Add Place API request")
public void i_send_the_add_place_api_request() {
	response.then().log().all();
    
}
@Then("the response should return status code {int}")
public void the_response_should_return_status_code(int statusCode) {
	Assert.assertEquals(statusCode, response.getStatusCode());
    
}
@Then("the response should contain {string} as {string}")
public void the_response_should_contain_as(String key, String value) {
    Assert.assertEquals(value, response.jsonPath().getString(value));
}
}
