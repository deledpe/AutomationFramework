package BDDAutomationAPI;
// https://www.youtube.com/watch?v=c04OckzYeOk



import org.testng.annotations.Test;
import static io.restassured.RestAssured.*; // import 
import static org.hamcrest.Matchers.*;



// User POSTMAN to view the header or body details that you want to validate
/*
 given()
    set cookies, add auth, add param, set headers info etc....
 when()
    get, post, put, delete
 then()
 validate status code, extract response, extract header cookies & response body....   
 
 */

public class TC1001_GET_User {
	
	
	@Test
	public void TC001_GET_SingleUser() {
		
		    
		  given()
		  .when()
		      .get("https://reqres.in/api/users?page=2")
		  .then()
		  
		       .statusCode(200)
		       .statusLine("")
		       .assertThat().body("", equalTo(""))
		       .header("", "")
		       .log().all();	     	
		
	}
	
}
