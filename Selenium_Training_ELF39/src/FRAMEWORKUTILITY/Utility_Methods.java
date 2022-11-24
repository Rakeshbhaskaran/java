package FRAMEWORKUTILITY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods {

	
		public static void Enter_Value_To_EditFeild(WebElement element, String value)
		{
			element.sendKeys(value);
		}
		
		
		public static void Click_Element(WebElement element)
		{
			element.click();
		}
		
		public static void drop_down_select_by_index(WebElement element, int index_no)
		{
			Select select = new Select(element);
			select.selectByIndex(index_no);
		}
		
		public static void drop_down_select_by_visibleText(WebElement element, String text)
		{
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}
		
		public static void drop_down_select_by_Value(WebElement element, String value)
		{
			Select select = new Select(element);
			select.selectByValue(value);
		}
		
		public static void moveTOElement(WebElement element, WebDriver d)
		{
			Actions action = new Actions(d);
			action.moveToElement(element).build().perform();
		}
		
		public static String test_configuration() throws IOException
		{
			FileInputStream fis= new FileInputStream("./test_configuration/testconfigaration.properties");
			Properties prop = new Properties();
			prop.load(fis);
			String url =prop.getProperty("URL");
			return url;
		}
		
		// test_configaration for KSRTC
		public static String test_configration_KSRTC() throws IOException
		{
			FileInputStream fis= new FileInputStream("./test_configuration/testconfigaration.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url =prop.getProperty("KSRTC_URL");
		return url;
			
		}
		
		
		// method to get test data
		public static Object[][] getTestData(String sheetname) throws IOException
		{
			String filepath="./test_data/Practice.xlsx";
			FileInputStream fis = new FileInputStream(filepath);
			
			Workbook book = new XSSFWorkbook(fis);
			Sheet sheet = book.getSheet(sheetname);
			
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
			
			book.close();
			return data;
			
		}
		
		
		
	

}
