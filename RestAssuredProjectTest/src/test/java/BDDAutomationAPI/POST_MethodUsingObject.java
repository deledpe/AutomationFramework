package BDDAutomationAPI;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class POST_MethodUsingObject {
	
	
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
	

}
