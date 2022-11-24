package PRACTICE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import FRAMEWORKUTILITY.Utility_Methods;

public class WW_EXCEL_PRACTICE {

	@DataProvider(name = "Excel_data")
	public Object[][] data() throws IOException
	{
		String filepath="./test_data/Practice.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		int rows =sheet.getPhysicalNumberOfRows();
		int columns=sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		Object[][] data = new Object[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				String temp=sheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j]=temp;
			}
		}
		
		return data;
	}
	
	
	@Test(dataProvider = "Excel_data")
	public void register(String FN,String LN, String email/* String password, String confirmPassword*/)
	{
		
		System.out.print(FN+" "+LN+" "+" "+email+" "/*+password+" "+confirmPassword*/);
		System.out.println();
		
		
	}

}
