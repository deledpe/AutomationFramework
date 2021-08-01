package demo;

import org.testng.annotations.DataProvider;

public class DataForPost {
	
	
    
	@DataProvider(name ="DataForPost")
	public Object [][] DataForPost () {
	 

		
	// Dynamic data set approach
		 
		return new Object [][] {
			
			{"Kenny"," Lee"},
			{"Tony"," Lee"},
			{"Mary"," Larry"},
			{"Benny"," Hall"},
			
		};

   }

//	   @DataProvider(name="DeleteData")
	   public Object[] dataFordelete () {
		   
		   return new Object []{
				   
				   964,975,800,508
		   };
		   
	    }
	}
	
	
