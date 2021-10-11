package BDDAutomationAPI;

import java.util.List;
import org.testng.annotations.Test;

public class GETPassMulipleData {
	
	@Test
	public void UserOrderItemValidData() {
	
		   @RequestMapping(value = "/mno/{objectKey}", method = RequestMethod.GET, produces = "application/json")
		    public List<String> getBook(HttpServletRequest httpServletRequest, 
		        @PathVariable(name = "objectKey") String objectKey,
		        @RequestParam(value = "id", defaultValue = "false")String id,
		        @RequestParam(value = "name", defaultValue = "false") String name) throws Exception {
		               //logic
		}

}
