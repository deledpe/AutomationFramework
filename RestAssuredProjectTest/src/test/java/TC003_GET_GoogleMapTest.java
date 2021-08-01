import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC003_GET_GoogleMapTest {
	
	
	@Test
	void GET_googlePamHeader() {
		
		//specify base url		
		RestAssured.baseURI ="https://maps.googleapis.com";
		
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
		
		//Response object
		Response response=httpRequest.request(Method.GET, "");
		
		// Response in window console
		String responseBody= response.getBody().asString();
		System.out.println("ResponseBody is "+ responseBody);
		
		
		// Capture the details of header
			String contentType =response.header("content-e ");
			System.out.println("the content type is" + contentType );
			Assert.assertEquals(contentType , "text/html; charset=utf-8");
			
			//content-type →text/html; charset=utf-8
				
		
	   // Capture the details of header
		String contentEncoding =response.header("content-encoding ");
		System.out.println("the content type is" + contentEncoding);
		Assert.assertEquals(contentEncoding , "gzip");
		
		//content-encoding →gzip
			
	   //Validation status code
		int statusCode =response.getStatusCode();
		System.out.println("The status code is " + statusCode);
		Assert.assertEquals(statusCode, 200);

	
	}	

}
