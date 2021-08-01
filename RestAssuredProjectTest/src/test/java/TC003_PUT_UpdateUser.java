import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC003_PUT_UpdateUser {
	
	 @Test
     void PUT_CreateNewUser() {
		
		//specify base url		
		RestAssured.baseURI ="https://reqres.in/api/users";
		
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
		
		JSONObject requestparams = new JSONObject();
		
		requestparams.put("name", "Morpheus2");
		requestparams.put("Job", "Leader");
		
	    
		httpRequest.headers("content-type", "application/json");  // Add content type
		httpRequest.body(requestparams.toJSONString()); // Add request to the body of the put/attach data to the request
		
		// We need to send the request using POST request
		Response response=httpRequest.request(Method.POST, "users");
		
		
		// Response in window console
		String responseBody= response.getBody().asString();
		System.out.println("ResponseBody is "+ responseBody);
			
	   //Validation status code
		int statusCode =response.getStatusCode();
		System.out.println("The status code is " + statusCode);
		//Assert.assertEquals(statusCode, 201);
		Assert.assertEquals(statusCode, 201);

	    String successCode= response.jsonPath().get("successCode");
	    Assert.assertEquals(successCode, "OPERATION_SUCCESS");
	}	

}
