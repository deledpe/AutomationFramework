package BDDAutomationAPI2;



import org.testng.Assert;
import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;

public class BDD_GET_User {
	
	
//	@Test
	void TC2001_GET_SingleUser () {
				
	//Response response = RestAssured.get("https://reqres.in/api/users/8");
	//Response response = RestAssured.get("https://reqres.in/api/users/9");
		
		// To direct access RestAssured io without declaring the class, make it static	
		Response response = get("https://reqres.in/api/users/8");
		
	
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusCode());
		System.out.println(	response.getStatusLine());	
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());	
		
		int statusCode = response.getStatusCode();
	    Assert.assertEquals(statusCode, 200);
		
	}		
	
	// Or 
	
	@Test
	void TC2002_GET_SingleUser () {
		
		given().
		       get("https://reqres.in/api/users/8").
		then().
		     statusCode(200).
		     body("data.id[8]", equalTo(8)).	  
		     log().all();
	   }
	
	}

