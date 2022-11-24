package TESTNG_BASICS;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WW_Excel_Iteration {

	@Test
	public void Excel() throws IOException
	{
		String filepath="./test_data/Practice.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		int rows =sheet.getPhysicalNumberOfRows();
		int columns=sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		Object[][] data = new Object[rows-1][columns];
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		

		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.println(data[i][j]);
				
			}
			System.out.println();
		}
	}

}
