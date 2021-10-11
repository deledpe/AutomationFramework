

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;



public class TC2002_POST_CreateUser {
	
	@Test
	public void createUser () {
		
		Map<String, Object> map = new HashMap<String, Object> ();
		
	      map.put("name", "Williams");
	      map.put("Job", "Director");
	      
	      System.out.println(map);
	      System.out.println("Pass");
	      
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
		     delete("https://reqres.in/api/users/218").
		     
		then().		
		    statusCode(204).
		    log().all();
		   		
		System.out.println("Pass");
		
	}

}
