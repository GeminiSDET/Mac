package pages;

import base.BaseClass;
import io.restassured.response.Response;
import pojo.ProductRequest;
import static io.restassured.RestAssured.given;

public class ProductPage extends BaseClass{
	public Response addProduct(String token,ProductRequest productRequest){
		return given().header("Authorization","token")
				.header("Content-Type", "application/json")
				.body(productRequest)
				.when()
				.post("/api/ecom/product/add-product");
	}

	
}
