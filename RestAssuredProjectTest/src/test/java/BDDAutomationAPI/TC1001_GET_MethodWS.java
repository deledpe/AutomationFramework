package BDDAutomationAPI;
// https://www.youtube.com/watch?v=mkIliGAePBM



import org.testng.annotations.Test;
import static io.restassured.RestAssured.*; // import 
import static org.hamcrest.Matchers.*;



public class TC1001_GET_MethodWS {
	
	
	@Test
	public void TC001_GET_SingleUser() {
		
		    
		  given().
		      get("https://reqres.in/api/users?page=2").
		  then().
		       statusCode(200).
		       body("data.id[1]", equalTo(8)). // The index usually start
		       log().all(); // This will log the response details in the console	     	
		
	}
	
	@Test
	public void TC002_GET_SingleUser() {
		
		    
		  given().
		      get("https://reqres.in/api/users?page=2").
		  then().
		       statusCode(200).
		   //    body("data.id[1]", equalTo(8)). // The index usually start at 0, which mean
		       body("data.first_name", hasItems("Lindays", "Michael")).
		       log().all(); // This will log the response details in the console	     	
		
	}

}
