package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredAuthExample {

	
	//@Test
	public void basicAuth() {
		
		Response response = 
				given(). 
					contentType(ContentType.JSON).
					auth().preemptive().basic("admin", "password123").
					//header("Cookie", "token=abc123").
				when(). 
					delete("https://restful-booker.herokuapp.com/booking/366"). 
				then(). 
					extract().response();
		
		System.out.println(response.asPrettyString());
				
	}
	
	@Test
	public void formAuth() {
		
	}
	
}
