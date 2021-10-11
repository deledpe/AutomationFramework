package Steps;

import io.restassured.http.ContentType;

public class performGETVerifyStatusCode {
	
	given()	       
	        .contentType(ContentType.JSON)
	        	        
	 .when()
	         .get("http://localhost:3000/posts/1")
	         
	  .then() 
	         .body("Author", containInAnyOrder("James", "Hall GL"))
	         .statusCode(200);

}
