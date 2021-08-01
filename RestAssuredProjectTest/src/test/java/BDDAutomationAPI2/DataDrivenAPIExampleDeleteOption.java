
// https://www.youtube.com/watch?v=2ggM0vm4fbg

package BDDAutomationAPI2;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class DataDrivenAPIExampleDeleteOption {
	
	
	@DataProvider(name ="UserTestDataForPost")
	public Object [][] DataForPost () {
	 
		
		// 2 is equal to number of rows while 3 is equal to number of column.
//		This data is hard coded
//		  Object [][] data = new Object [2][2]; 
//		  
//		  data [0][0] = "James";
//		  data [0][1] = "Project Manager";
//		  
//		  
//		  data [1][0] = "Mary";
//		  data [1][1] = "Sales";
//		  
//		  return data;
		
	// Dynamic data set approach
		 
		return new Object [][] {
			
			{"Kenny"," Engineer"},
			{"Tony"," Business Analyst"},
			{"Mary"," Automation Tester"},
			{"Benny"," Project"},
			
			
		};
//		
	}
	@Test(dataProvider = "UserTestDataForPost")
	public void dataDrivenPost(String name, String job) {
		
		   
	     JSONObject request = new  JSONObject ();
	     
	     request.put("name", name);
	     request.put("job", job);		     
	     
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

}
