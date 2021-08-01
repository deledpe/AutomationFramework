package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtils {
	
	public static void main(String[] args) {
		
	//	getRowCount();
		getRowCount();
		
	}
	
	public static void getRowCount () {
		
	 
		try {
		
	//	   String excelPath ="./data/testData.xlsx";
		   String excelPath ="C:/TestData/testData.xlsx";
		   
		   
			XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			int rowCount =sheet.getPhysicalNumberOfRows();
			System.out.println(rowCount);
			
			
		} catch (Exception exp) {
	        System.out.println(exp.getMessage());
	        System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		   
		   
		   
	}

}
