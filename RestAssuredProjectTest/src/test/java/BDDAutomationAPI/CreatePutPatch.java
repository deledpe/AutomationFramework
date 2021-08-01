package BDDAutomationAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;
import static io.restassured.RestAssured.*;




public class CreatePutPatch {
	
	
	@Test
	public void CreateUser () {
		
		
		JSONObject request = new JSONObject ();
		
		request.put("Name", "Lord Nelson");
		request.put("Job", "Director");
		
		System.out.println(request);
		
		System.out.println(request.toJSONString());
		
		
		given().
			 header("Content-Type", "Application/json").
	         contentType(ContentType.JSON).
	         accept(ContentType.JSON).
	         body(request.toJSONString()).
		
		when().
		     post("https://reqres.in/api/users").		
		then().
		     statusCode(201).and().log().all();	
		System.out.println(" User account has been successfull created using POST");
		
		}
		
	    @Test
		public void updateUserPUT () {
			
			
			JSONObject request = new JSONObject ();
			
				request.put("Name", "Lord Nelson");
				request.put("Job", "CEO");
				
				
				System.out.println(request);
				
				
				given().
			         header("contentype", "Application/jason").
			         contentType(ContentType.JSON).
			         accept(ContentType.JSON).
			         body(request.toJSONString());	
				
				System.out.println(" User account has been successfull updated using PUT");
				
											
			}	
		  
	       @Test
           public void updateUserPATCH () {
			
			
			JSONObject request = new JSONObject ();
			
				request.put("Name", "Lord Nelson");
				request.put("Job", "Senior Director");
				
				
				System.out.println(request);				
				
				given().
			         header("contentype", "Application/jason").
			         contentType(ContentType.JSON).
			         accept(ContentType.JSON).
			         body(request.toJSONString());	
				
				System.out.println(" User account has been successfull updated using PATCH");
															
			}	
	       
	       @Test
	       public void singleUserGET () {
	    	   
	    	   given().
	    	         get("https://reqres.in/api/users?page=844").
	    	   then().
	    	      statusCode(200)
	    	      .log().all();
	    	   
	    	   System.out.println(" User account has been successfull retrieved using GET");
	       
         } 
	     @Test
	       public void delete () {
	    	   
	    	   when().
	    	        delete("https://reqres.in/api/users?page=844").
	    	   then().
	    	        statusCode(204);
	    	   
	    	   System.out.println(" User account has been successfull deleted");
	       }
	}






