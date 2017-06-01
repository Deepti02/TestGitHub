package myFirstPackage;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		// Provide the path of excel which has data
		File src = new File("C:\\ExcelData\\TestData.xlsx");
		//Loaded the file as bytes
		FileInputStream fis = new FileInputStream(src);
		//Load the complete workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//This is for xlsx workbook
		//HSSFWorkbook wb = new HSSFWorkbook(fis);
		//Load the 1st sheet		
		//HSSFSheet sheet1= wb.getSheetAt(0);
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		for(int i=0; i<3;i++)
		{
		int j =1;
		String uName = sheet1.getRow(i).getCell(0).getStringCellValue();
		String pssWd = sheet1.getRow(i).getCell(j).getStringCellValue();
		System.out.println("Username "+uName);
		System.out.println("Password "+pssWd);
		
	    }
		
		wb.close();

}
}
	
