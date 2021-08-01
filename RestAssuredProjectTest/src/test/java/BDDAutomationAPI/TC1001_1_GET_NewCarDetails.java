package BDDAutomationAPI;
// https://www.youtube.com/watch?v=mkIliGAePBM


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*; // import so that you don't create a class for the object.
import static org.hamcrest.Matchers.*;

import org.hamcrest.core.Is;



public class TC1001_1_GET_NewCarDetails {
	
	
	@Test
	public void TC001_GET_NewCars() {
		
		    
		  given().
		 //     get("https://reqres.in/api/users?page=2").
		        get(" http://localhost:3000/NewCars").
		      
		  then().
		       statusCode(200).
		       log().all(); 	     			
	}
	
	@Test
	public void TC001_GET_CarType() {
				    
		  given(). 
		        get("http://localhost:3000/NewCars").
		      
		  then().
		       statusCode(200).
		       
		     
		       log().all(); // This will log the response details in the console	     			

	}

}
