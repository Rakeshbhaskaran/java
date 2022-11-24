package TESTCASE;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import FRAMEWORKUTILITY.Utility_Methods;

public class Search_TC extends Base_Test{
	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException
	{
		Object[][] data= Utility_Methods.getTestData("SEARCH");
		/*data[0][0]="books";*/
		return data;
	}

	

	@Test(dataProvider = "TestData")
	public void search(String value)
	{
		WebElement search_feild=d.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(search_feild, value);
		
		WebElement search_button=d.findElement(By.xpath("(//input[@type=\"submit\"])[1]"));
		Utility_Methods.Click_Element(search_button);
		
	}
	
	

}
