package demo;

import org.testng.annotations.DataProvider;

public class DataForTest11 {
	
	
	@DataProvider(name ="DataForTest11")
	public Object[][] dataForPost () {   
		
// Hard coded		
		//The box hold the number of row while the second box is number of column
//		Object [][] data = new Object[4][2]; 
//		
//		data [1][0] ="Larry Jones"; //First row, first column
//		data [1][1] = "CEO";  // First row, second column
//		
//		data [2][0] ="John Benson";
//		data [2][1] = "Director"; 
//		
//		data [3][0] ="Law Murphy";
//		data [3][1] = "Founder & CEO"; 
//		
//		// We need to return the something for the class
//		return data; //which remove the dataForPost error.
		
//	Dynamic approach	
		return new Object [][] {
			
			{"Test Lee", "Bell"},
			{"James", "Bell"},
			
	    };
	    
	}
//	    @DataProvider(name = "DeleteData")
		public Object [] dataDelete () {
			
			return new Object [] {
					
				39, 439	
			};		
		}
	
	

}
