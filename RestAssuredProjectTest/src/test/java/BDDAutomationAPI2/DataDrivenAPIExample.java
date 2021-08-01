
// https://www.youtube.com/watch?v=2ggM0vm4fbg
package BDDAutomationAPI2;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class DataDrivenAPIExample extends UserTestDataForPost{
	
	
	@DataProvider(name ="UserTestDataForPost")
	public Object [][] DataForPost () {
	 
		
		// 2 is equal to number of rows while 3 is equal to number of column.
//		This data is hard coded
//		  Object [][] data = new Object [2][2]; 
//		  
//		  data [0][0] = "James";
//		  data [0][1] = "IT Engineer";
//		  
//		  
//		  data [1][0] = "Mary";
//		  data [1][1] = "Business Analyst";
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
	  
//	   @DataProvider(name="DeleteData")
	   public Object[] dataFordelete () {
		   
		   return new Object []{
				   
				   651,415,300,13
		   };
		   
		   
	   }
		
	//	@Test(dataProvider = "DeleteData")
		public void test_delete (int userid ) {
			
			when().
			     delete("https://reqres.in/api/users/" + userid ).
			     
			then().		
			    statusCode(204).
			    log().all();		
			
	 }

// Sometime when you have less data and did not want to use a separate  DataProvider, you can parameterise as well. 	
	    
//		@Parameters({"userid"})
//		@Test
		public void test_delete2 (int userid ) {
			
			given().
			     get("https://reqres.in/api/users/");
			
			System.out.println("The value for your userid is :"+ userid);
		
			when().
			     delete("https://reqres.in/api/users/" + userid ).
			     
			then().		
			    statusCode(200).
			    log().all();		
	
     }
}

