package KSRTC;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Utility_Methods;

public class SEARCH_FOR_BUS extends BASE_TEST_KSRTC {
	
	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException
	{
		Object[][] data = Utility_Methods.getTestData("KSRTC");
		return data;
	}

	
	
	@Test(dataProvider = "TestData")
	public void search_bus(String leave_from,String Leave_to)
	{
		WebElement Leave_from=d.findElement(By.xpath("//input[@id=\"fromPlaceName\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(Leave_from, "bangalore");
		
		WebElement first_option=d.findElement(By.xpath("(//ul[@tabindex=\"0\"])[1]//li[1]"));
		Utility_Methods.Click_Element(first_option);
		
		WebElement Leave_to_feild=d.findElement(By.xpath("//input[@id=\"toPlaceName\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(Leave_to_feild,"chennai");
		
		WebElement first_option2=d.findElement(By.xpath("(//ul[@tabindex=\"0\"])[2]/li[1]"));
		Utility_Methods.Click_Element(first_option2);
		
		d.findElement(By.xpath("//input[@id=\"txtJourneyDate\"]")).click();
		d.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr[3]/td[4]")).click();
		
		d.findElement(By.xpath("//input[@id=\"txtReturnJourneyDate\"]")).click();
		d.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr[4]/td[4]")).click();
		
		
		d.findElement(By.xpath("//div[@id=\"corover-close-btn\"]")).click();

		d.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
		d.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
		
		
		
		
		
	}
	

}
