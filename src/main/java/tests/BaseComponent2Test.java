package tests;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import utils.BaseComponent2;

public class BaseComponent2Test extends BaseComponent2 {

	@Test
	public void postTodoWithAuth() {
		
		Response response = doPostRequest("{\n"
				+ "    \"title\":\"Microsoft\",\n"
				+ "    \"body\": \"testCeva\"\n"
				+ "}",
				"save");
		
		System.out.println(response.asPrettyString());
		
	}
	
	
}
