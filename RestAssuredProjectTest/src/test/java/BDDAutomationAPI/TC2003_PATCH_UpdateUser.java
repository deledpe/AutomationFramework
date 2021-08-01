package BDDAutomationAPI;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;



public class TC2003_PATCH_UpdateUser {
	
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

}
