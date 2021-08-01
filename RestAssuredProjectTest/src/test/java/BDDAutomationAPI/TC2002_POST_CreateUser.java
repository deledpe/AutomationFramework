package BDDAutomationAPI;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;



public class TC2002_POST_CreateUser {
	
	@Test
	public void createUser () {
		
		Map<String, Object> map = new HashMap<String, Object> ();
		
	      map.put("name", "Williams");
	      map.put("Job", "CEO");
	      
	      System.out.println(map);
	      
	      given().
	          header("content-type", "application/json").
	          contentType(ContentType.JSON).
	          accept("ContentType.JSON").
	      
	      when().
	           post("https://reqres.in/api/users").
	      
	      then().	          
		      statusCode(201).
		      log().all();
		
	}
	
	
//	@Test
	public void UpdateUser1Post() {
		
   
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
		          post("https://reqres.in/api/users/2").
		     then().
		          statusCode(201).
		          log().all();
		     
	}	
	
//	@Test
//	public void GET_User () {
//		
//		given().
//		    get("https://reqres.in/api/users/44").
//		    
//		then().
//		    statusCode(200).log().all();
//		
//	
//}
	
	@Test
	public void delete () {
		
		when().
		     delete("https://reqres.in/api/users").
		     
		then().		
		    statusCode(204).
		    log().all();
		   		
		
	}

}
