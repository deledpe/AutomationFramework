package BDDAutomationAPI2;

import org.testng.annotations.DataProvider;

public class UserTestDataForPost {
	
	

	@DataProvider(name ="UserTestDataForPost")
	public Object [][] DataForPost () {
	 

		
	// Dynamic data set approach
		 
		return new Object [][] {
			
			{"Kenny"," Engineer"},
			{"Tony"," Business Analyst"},
			{"Mary"," Automation Tester"},
			{"Benny"," Project"},
			{"Kenny"," Data Scientit"},
			
			
		};

   }

//	   @DataProvider(name="DeleteData")
	   public Object[] dataFordelete () {
		   
		   return new Object []{
				   
				   964,975,800,508
		   };
		   
	    }
	}
	
	
