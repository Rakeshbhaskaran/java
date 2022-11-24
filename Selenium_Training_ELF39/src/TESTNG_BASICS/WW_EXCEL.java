package TESTNG_BASICS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WW_EXCEL {

	@Test
	public void excel() throws IOException
	{
		String filepath="./test_data/testdata.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		
		//upcasting and opening a excel
		Workbook book = new XSSFWorkbook(fis);
		
		//accessing a sheet from the excel file
		Sheet sheet =book.getSheet("Sheet1");
		
		String value=sheet.getRow(1).getCell(0).getStringCellValue();
		String value1=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.print(value);
		System.out.print(" ");
		System.out.println(value1);
	}

}
