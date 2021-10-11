// https://www.youtube.com/watch?v=Inwycw_Cpzk&list=PL6tu16kXT9PpgqfMbMdzUzDenYgb0gbk0&index=3
// Part 3 - GET and assert Operation with REST-assured and cucumber


package Steps;

public class GetPostSteps {
	
	
	public void PerformGetEquals() {
		
		given()
		       .contentType(ContenType/JSON)
		.when()
		       .get(s:"")
		.then()
		        .body(s:"firstName", is("james");
		        
		   		
		
	}
		
}
