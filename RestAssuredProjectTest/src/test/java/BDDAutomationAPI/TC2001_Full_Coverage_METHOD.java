package BDDAutomationAPI;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;




public class TC2001_Full_Coverage_METHOD {
	
	@Test
	public void CreateUserPost() {
		
		// First option to create POST request
//		Map<String, Object> map = new HashMap <String, Object> ();
//		
//		     map.put("name","John");
//		     map.put("job","Director");	     
//		     System.out.println(map);
//		     
		     
		//Second option to create POST request     
		     JSONObject request = new  JSONObject ();
		     
		     request.put("name","George");
		     request.put("job","Manager");		     
		     
		     System.out.println(request);
		     System.out.println(request.toJSONString());
		     
		     
		     given(). // import RestAssured library
		          header("Content-Type", "Application/json").
		          contentType(ContentType.JSON).
		          accept(ContentType.JSON).
		          body(request.toJSONString()).
		     	     
		     when().
		          post("https://reqres.in/api/users").
		     then().
		          statusCode(201).		        
		          log().all();
		     
		     System.out.println("Printed the log ");
		    					
	}
	
	
	@Test
	public void UpdateUserPut() {
		
   
		     JSONObject request = new  JSONObject ();
		     
		     request.put("name","John");
		     request.put("job","Manager");		     
		     
		     System.out.println(request);
		     System.out.println(request.toJSONString());
		     
		     
		     given(). // import RestAssured library
		          header("Content-Type", "Application/json").
		          contentType(ContentType.JSON).
		          accept(ContentType.JSON).
		          body(request.toJSONString()).
		     	     
		     when().
		          put("https://reqres.in/api/users/2").
		     then().
		          statusCode(200).
		          log().all();
		     
	}	
	
	@Test
	public void UpdateUser1Patch() {
		
   
		     JSONObject request = new  JSONObject ();
		     
		     request.put("name","Mary");
		     request.put("job","Manager");		     
		     
		     System.out.println(request);
		     System.out.println(request.toJSONString());
		     
		     
		     given(). // import RestAssured library
		          header("Content-Type", "Application/json").
		          contentType(ContentType.JSON).
		          accept(ContentType.JSON).
		          body(request.toJSONString()).
		     	     
		     when().
		          patch("https://reqres.in/api/users/2").
		     then().
		          statusCode(200).
		          log().all();
		     
	}	
	@Test
	public void TC001_GET_SingleUser() {
		
		    
		  given().
		      get("https://reqres.in/api/users?page=2").
		  then().
		       statusCode(200).
	//	       body("data.id[1]", equalTo(8)).
	//	       body("data.first_name", hasItems("Mary", "Michael")).
		       body("data.first_name", hasItems("Byron", "Michael","Lindsay","George","Rachel")).
		       log().all(); // This will log the response details in the console
		  
	}
	
	@Test
	public void deleteUser() {
 	     
		     when().
		          delete("https://reqres.in/api/users/2").
		     then().
		          statusCode(204).
		          log().all();
	} 
}
