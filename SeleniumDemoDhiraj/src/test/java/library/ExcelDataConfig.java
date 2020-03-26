package library;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	File src;
	public ExcelDataConfig(String filePath) {
		// TODO Auto-generated constructor stub
		try {
			src=new File(filePath);
			FileInputStream fileInputStream=new FileInputStream(src);
			workbook = new XSSFWorkbook(fileInputStream);
			sheet = workbook.getSheet("Sheet1");
			//sheet = workbook.getSheetAt(0);  --> Based on index			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error :"+e.getMessage());
		}
	}
	
	public String getData(String sheetName,int rowNumber,int columnNumber)
	{
		sheet = workbook.getSheet(sheetName);
		String data = sheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
		return data;
	}
	
	public void getFullExcelData(String path,String sheetName)
	{
		sheet = workbook.getSheet(sheetName);
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
	}
	
	public void writeExcelData(String path)
	{
		src=new File(path);
		workbook = new XSSFWorkbook();
		sheet=workbook.createSheet("raghu");
		Object[][] data =
		{
			{"Name", "Data" },
			{"John", "ABC" },
			{"Smith", "123" }
			
		};
		int rowNum = 0;
		for(Object[] i:data)
		{
			XSSFRow row = sheet.createRow(rowNum++);
			int colNum=0;
			for(Object k:i)
			{
				XSSFCell cell=row.createCell(colNum++);
				if(k instanceof String)
				{
					cell.setCellValue((String)k);
				}
				else if(k instanceof Integer)
				{
					cell.setCellValue((Integer)k);
				}
			}
			
		}
		
	}

}
