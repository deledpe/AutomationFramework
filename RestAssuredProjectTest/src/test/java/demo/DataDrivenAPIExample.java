
// Referencing DataForPost

// https://www.youtube.com/watch?v=2ggM0vm4fbg
package demo;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class DataDrivenAPIExample extends DataForPost{
	
	
	@DataProvider(name ="DataForPost")
	public Object [][] DataForPost () {
	 
		
		// 2 is equal to number of rows while 3 is equal to number of column.
//		This data is hard coded
//		  Object [][] data = new Object [2][2]; 
//		  
//		  data [0][0] = "James";
//		  data [0][1] = "Keno";
//		  
//		  
//		  data [1][0] = "Mary";
//		  data [1][1] = "Rashid";
//		  
//		  return data;
		
	// Dynamic data set approach
		 
		return new Object [][] {
			
			{"Kenny1"," Engineer"},
			{"Tony1"," Business Analyst"},
			{"Mary1"," Automation Tester"},
			{"Benny1"," Project"},
			
		};
//		
	}
	@Test(dataProvider = "DataForPost")
	public void dataDrivenPost(String name, String jobTitle) {
		
		   
	     JSONObject request = new  JSONObject ();
	     
	     request.put("name", name);
	     request.put("job", jobTitle);		     
	     
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
	  
	//   @DataProvider(name="DeleteData")
	   public Object[] dataFordelete () {
		   
		   return new Object []{
				   
				   323,171,532,756
		   };
		   
		   
	   }
		
		@Test(dataProvider = "DeleteData")
		public void test_delete (int userid ) {
			
			when().
			     delete("https://reqres.in/api/users/" + userid ).
			     
			then().		
			    statusCode(204).
			    log().all();		
			
	 }

// Sometime when you have less data and did not want to use a separate DataProvider, you can parameterize as well.
// To run the test, select Test-Class, select TESTNG, convert to TestNg		
		
	    @Parameters({"userid"})
		@Test
		public void test_delete2 (int userid) {	
	    	
	    	System.out.println("The value of userid is: " + userid);
	    	
			given().
			     get("https://reqres.in/api/users/");
		
			when().
			     delete("https://reqres.in/api/users/" + userid ).
			     
			then().		
			    statusCode(200).
			    log().all();	
			
			// Updated API datadriven code.
	
     }
}

