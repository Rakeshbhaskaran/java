package TESTCASE;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import FRAMEWORKUTILITY.Utility_Methods;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
public class Login_TC extends Base_Test{
	
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException
	{
		
		
		Object [][] data = Utility_Methods.getTestData("Login");
		
		
		return data;
	}
	

	@Test(dataProvider="TestData")
	public void login(String email,String password)
	{
		//using utility methods
		WebElement login_lnk=d.findElement(By.xpath("//a[@href=\"/login\"]"));
		Utility_Methods.Click_Element(login_lnk);
		
		
		WebElement email_feild=d.findElement(By.xpath("//input[@id=\"Email\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(email_feild, email);
		
		WebElement password_feild=d.findElement(By.xpath("//input[@id=\"Password\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(password_feild, password);
		
		
		WebElement submit_button=d.findElement(By.xpath("(//input[@type=\"submit\"])[2]"));
		Utility_Methods.Click_Element(submit_button);
		
		WebElement logout_button=d.findElement(By.xpath("//a[@class=\"ico-logout\"]"));
		Utility_Methods.Click_Element(logout_button);
		
		
	}
	
	 


}
