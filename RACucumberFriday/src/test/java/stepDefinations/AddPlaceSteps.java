package stepDefinations;
import io.restassured.response.Response;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.hamcrest.Matchers.*;

public class AddPlaceSteps {

	@Given("I have a valid request body")
	public void i_have_a_valid_request_body() {
	    String requestBody ="{\n"
	    		+ "  \"location\": {\n"
	    		+ "    \"lat\": -38.383494,\n"
	    		+ "    \"lng\": 33.427362\n"
	    		+ "  },\n"
	    		+ "  \"accuracy\": 50,\n"
	    		+ "  \"name\": \"Frontline house\",\n"
	    		+ "  \"phone_number\": \"(+91) 983 893 3937\",\n"
	    		+ "  \"address\": \"29, side layout, cohen 09\",\n"
	    		+ "  \"types\": [\n"
	    		+ "    \"shoe park\",\n"
	    		+ "    \"shop\"\n"
	    		+ "  ],\n"
	    		+ "  \"website\": \"http://google.com\",\n"
	    		+ "  \"language\": \"French-IN\"\n"
	    		+ "}";
	    AddPlacePage addPlacePage=new AddPlacePage();
	    addPlacePage
	}
	@When("I send a POST request to add a place")
	public void i_send_a_post_request_to_add_a_place() {
	    
	}
	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be(Integer int1) {
	    
	}
	@Then("the response should contain a valid place_id")
	public void the_response_should_contain_a_valid_place_id() {
	    
	}
}
