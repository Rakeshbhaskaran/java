package TESTCASE;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import FRAMEWORKUTILITY.Utility_Methods;

public class ADVAN_SEARCH extends Base_Test {
	
	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException
	{
		Object[][] data = Utility_Methods.getTestData("adv");
		/*data[0][0]="mobile";
		data[0][1]=8;
		data[0][2]=1;
		data[0][3]="0";
		data[0][4]="50000";*/
		
		return data;
	}
	


	@Test(dataProvider = "TestData")
	public void advance_search(String value, String drop_value,String drop_value1,String SV,String EV)
	{
		WebElement search_feild=d.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(search_feild, value);
		
		WebElement search_button=d.findElement(By.xpath("//input[@type=\"submit\"]"));
		Utility_Methods.Click_Element(search_button);
		
		WebElement adv_srch_checkbox=d.findElement(By.xpath("//input[@id=\"As\"]"));
		Utility_Methods.Click_Element(adv_srch_checkbox);
		
		
		WebElement category_dropdown=d.findElement(By.xpath("//select[@id=\"Cid\"]"));
		Utility_Methods.drop_down_select_by_visibleText(category_dropdown, drop_value);
		
		WebElement auto_srch_checkbox=d.findElement(By.xpath("//input[@id=\"Isc\"]"));
		Utility_Methods.Click_Element(auto_srch_checkbox);
		
		WebElement mfd_dropdown= d.findElement(By.xpath("//select[@id=\"Mid\"]"));
	    Utility_Methods.drop_down_select_by_visibleText(mfd_dropdown, drop_value1);
		
		WebElement start_value=d.findElement(By.xpath("//input[@class=\"price-from\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(start_value, SV);
		
		WebElement end_value=d.findElement(By.xpath("//input[@class=\"price-to\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(end_value, EV);
		
		WebElement product_search_checkbox=d.findElement(By.xpath("//input[@id=\"Sid\"]"));
		Utility_Methods.Click_Element(product_search_checkbox);
		
		WebElement search_button1= d.findElement(By.xpath("(//input[@type=\"submit\"])[2]"));
		Utility_Methods.Click_Element(search_button1);
	}
	
	
	
}
