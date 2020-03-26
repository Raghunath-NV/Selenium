package excelOperations;

import java.io.File;

import library.ExcelDataConfig;

public class CallExcelMethods {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectLocation=System.getProperty("user.dir");
		ExcelDataConfig excelDataConfig=new ExcelDataConfig(projectLocation+"/Data/Data.xlsx");
		
		excelDataConfig.writeExcelData(projectLocation+"/Data/Data.xlsx");
		
		excelDataConfig.getFullExcelData(projectLocation+"/Data/Data.xlsx", "raghu");
		
		
	}

}
