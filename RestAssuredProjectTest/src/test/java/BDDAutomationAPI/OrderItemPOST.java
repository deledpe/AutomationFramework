package BDDAutomationAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class OrderItemPOST {
	
	
	public void UserOrderItemPOSTInvalidData() {
	    JSONObject request = new  JSONObject ();
	    
	    request.put("name","Larry Tester1");
	    request.put("address","");
	    request.put("emailAddress","jamestester1test.com");
	    
	    System.out.println(request);
	    System.out.println(request.toJSONString());
	    
	    
	    given(). // import RestAssured library
	         header("Content-Type", "Application/json").
	         contentType(ContentType.JSON).
	         accept(ContentType.JSON).
	         body(request.toJSONString()).
	    	     
	    when().
	         post("https://www.testqa.com/api/users").
	    then().
	         statusCode(400).		        
	         log().all();
	    
	    System.out.println("Printed the log ");
	   					
      }
// Valid API call (REST API)	
	@Test
	public void UserOrderItemValidData() {
       
			JSONObject request = new  JSONObject ();
		    
		    request.put("name","James Tester1");
		    request.put("address"," 200 City road, London, UK, SW105Tg");	
		    request.put("emailAddress","jamestester1@test.com");
		    
		    System.out.println(request);
		    System.out.println(request.toJSONString());
		    
		    
		    given(). 
		         header("Content-Type", "Application/json").
		         contentType(ContentType.JSON).
		         accept(ContentType.JSON).
		         body(request.toJSONString()).
		    	     
		    when().
		         post("https://www.testqa.com/api/users").
		    then().
		         statusCode(201).		        
		         log().all();
		    
		    System.out.println("Printed the log ");	   					
			
	}
	@Test
	public void TC001_GET_User() {
		
		    
		  given().
		      get("https://www.testqa.com/api/users").
		  then().
		       statusCode(200).
		       
		       
		       
		       
		       body("data.emailAddress", hasItems("jamestester1@test.com")).
		       log().all();
		  
	}

}
