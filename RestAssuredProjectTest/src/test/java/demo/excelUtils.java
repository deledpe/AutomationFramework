package demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelUtils {
		
	static XSSFWorkbook workbook;
	static XSSFSheet Sheet;

	public excelUtils(String excelPath, String SheetName) {
			
		try {
			
		 workbook = new XSSFWorkbook(excelPath);
		 Sheet = workbook.getSheet(SheetName);			
//			
//		XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
//		XSSFSheet Sheet = workbook.getSheet(SheetName);
		
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
	
//	 To create a function to get number of cells	
	public static void getCellData () {		
		try {
			
			// excelPath ="./Data/TestData.xlsx";		
			//	XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			//	XSSFSheet Sheet = workbook.getSheet("Sheet1");
				
			    DataFormatter formatter = new  DataFormatter ();			    
			    Object value = formatter.formatCellValue(Sheet.getRow(1).getCell(1));
			    
			    
		//	    double Value =Sheet.getRow(1).getCell(0).getNumericCellValue();
			    System.out.println(value);			    
				
				
			} catch (Exception exp) {
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
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("the row count is :"+rowCount);
			
			
		} catch (IOException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	
	}

}
