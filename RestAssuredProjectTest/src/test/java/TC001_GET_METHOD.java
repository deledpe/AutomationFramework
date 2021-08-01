import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;



// Request /api/users?page
public class TC001_GET_METHOD {
	
	@Test
	void getSingleCustomerList() {
		
		//specify base url		
		RestAssured.baseURI ="https://reqres.in/api/users/";
		
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
		
		//Response object
		Response response=httpRequest.request(Method.GET, "name");
				
		
		// Response in window console
		String responseBody= response.getBody().asString();
		System.out.println("ResponseBody is "+ responseBody);
			
	   //Validation status code
		int statusCode =response.getStatusCode();
		System.out.println("The status code is " + statusCode);
		Assert.assertEquals(statusCode, 200);
				
		//Validation status line
		String statusLine=response.getStatusLine();
		System.out.println(" statusLine is "+ statusLine);
		Assert.assertEquals(statusLine, "http/1.1 200 ok");
	
	}	
}
