
//https://www.youtube.com/watch?v=AWbwhkDceB0


package Utils;

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtils1 {
	
	
	public static void main(String[] args) {
		
		getRowCount();
		getCellData();
		
	}	
	public static void getCellData () {		
		try {
			
			String excelPath ="./Data/TestData.xlsx";
			
				XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
				XSSFSheet Sheet = workbook.getSheet("Sheet1");
				
			    DataFormatter formatter = new  DataFormatter ();			    
			    Object value = formatter.formatCellValue(Sheet.getRow(1).getCell(1));
			    
			    
			//    double Value =Sheet.getRow(1).getCell(2).getNumericCellValue();
			    System.out.println(value);			    
				
				
			} catch (IOException exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
				
			}		
		
	}	
	// To create a function to get number of rows
	public static void getRowCount() {		
		try {
			
		String excelPath ="./data/TestData.xlsx";
		
			XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			XSSFSheet Sheet = workbook.getSheet("Sheet1");
			
			int rowCount = Sheet.getPhysicalNumberOfRows();
			System.out.println("the row count is :"+ rowCount);
			
			
		} catch (IOException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	
	}
	

}
