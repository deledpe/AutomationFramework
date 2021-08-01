
//https://www.youtube.com/watch?v=AWbwhkDceB0


package demo;

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtils1 {
	
	static XSSFWorkbook workbook;
	static XSSFSheet Sheet;
	
	
	
	public ExcelUtils1(String excelPath, String SheetName) {
			
		try {
			
		 workbook = new XSSFWorkbook(excelPath);
		 Sheet = workbook.getSheet(SheetName);			
		
		} catch (IOException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
		}			
	}
	
	
	public static void main(String[] args) {
		
		getRowCount();
		getCellData();
		
	}		
	public static void getCellData () {		
			
			    DataFormatter formatter = new  DataFormatter ();			    
			    Object value = formatter.formatCellValue(Sheet.getRow(1).getCell(1));
			    System.out.println(value);			    	
		
	}	
	public static void getRowCount() {		
			
		String excelPath ="./data/TestData.xlsx";

			
			int rowCount = Sheet.getPhysicalNumberOfRows();
			System.out.println("the row count is :"+rowCount);
	  }
    }


