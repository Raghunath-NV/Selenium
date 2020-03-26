package excelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class ReadWriteExcel {

	public static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	
	public static void main(String[] args) throws Exception {
		String projectLocation=System.getProperty("user.dir");
		File src=new File(projectLocation+"/Data/Data.xlsx");
		FileInputStream fileInputStream=new FileInputStream(src);
		workbook =new XSSFWorkbook(fileInputStream);
		sheet = workbook.getSheet("Sheet1");
//		String header1 =sheet.getRow(0).getCell(0).getStringCellValue();
//		String header2 =sheet.getRow(0).getCell(1).getStringCellValue();
		
		int rowCount  = sheet.getLastRowNum() +1;  //number of rows
		int columnCount = sheet.getRow(0).getLastCellNum(); // columns
		
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<columnCount;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"	");
			}
			System.out.println();
		}
		
		
		
		//writing data
		
		sheet.getRow(1).createCell(0).setCellValue("Raghu");
		FileOutputStream fileOutputStream=new FileOutputStream(src);
		workbook.write(fileOutputStream);
		workbook.close();
		
		
		
	}

}
