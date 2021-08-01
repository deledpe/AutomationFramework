
package demo;


//import static io.restassured.RestAssured.baseURI; // This is static 0
//import static io.restassured.RestAssured.given; // This is static 
import static io.restassured.RestAssured.*; // This will import the two above including all other files. 
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;


// extends allow us to access the data from the supper class. For example, DataForTest class.

public class dataDrivenFramework1 extends DataForTest11 {  
	
	
// Step 1
	@Test(dataProvider="DataForTest11")
	public void CreateUserPost(String name, String jobTitle) {
		
		System.out.println(name);
		System.out.println(jobTitle);
		
		
   
		     JSONObject request = new  JSONObject ();
		     
		     request.put("name", name);
		     request.put("jobTitle", jobTitle);	
		     
		     
		     System.out.println(request);
		     System.out.println(request.toJSONString());
		     
		     
//		     baseURI = "https://reqres.in/api/users/2";
		     
		     
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

	// How to delete data step 1
//	@Test(dataProvider = "DeleteData")
	public void test_delete (int userid ) {
		
		when().
		     delete("https://reqres.in/api/users/" + userid ).
		     
		then().		
		    statusCode(204).
		    log().all();		
		
    }

}
