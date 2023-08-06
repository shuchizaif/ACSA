package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import edu.emory.mathcs.backport.java.util.Arrays;

/*public class ReadFileData {
      
	@DataProvider(name="LoginData")
	public  String[][] getData() throws IOException 
	{

		File excelFile = new File("C:\\Users\\Shuchi Zaifrani\\eclipse-workspace\\ACSACopy5\\src\\test\\java\\utils\\TestDatas.xlsx");
	    FileInputStream fis = new FileInputStream(excelFile);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook.getSheet("Sheet1");
	    int noOfRows= sheet.getPhysicalNumberOfRows();
	    int noOfCol = sheet.getRow(0).getLastCellNum();
	
	
	    String[][] data = new String [noOfRows-1][noOfCol];//As our excel file is 2dimensional, so to pass date from xcel file to 
	         //noOfRows-1: Exclude the Header                                           //DataProvider, we need 2dimensional Array.
	
	        for(int i=0;i<noOfRows-1;i++)
	  {
		  for(int j=0;j<noOfCol;j++)
		{
			DataFormatter df = new DataFormatter();//Will convert any form of data into String type
		    data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			//System.out.println(sheet.getRow(i+1).getCell(j).getStringCellValue());
		}
		System.out.println();
	}
       workbook.close();
	   fis.close();
	   return data;
		/* for(String[] dataArr : data)//Will read data one by one from data variable
		  {
		  System.out.println(Arrays.toString(dataArr));
		
		  }
		    
	   

	}
	
}*/