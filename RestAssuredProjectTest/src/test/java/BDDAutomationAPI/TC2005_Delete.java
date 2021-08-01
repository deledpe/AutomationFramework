package BDDAutomationAPI;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;



public class TC2005_Delete {
		
			
		@Test
		public void delete () {
			
			when().
			     delete("https://reqres.in/api/users/76").
			     
			then().		
			    statusCode(204).
			    log().all();
			   		
			
		}
	
//	@Test
//	public void GET_User () {
//		
//		given().
//		    get("https://reqres.in/api/users/76").
//		    
//		then().
//		    statusCode(404).log().all();
//		
//	
//   }

}
