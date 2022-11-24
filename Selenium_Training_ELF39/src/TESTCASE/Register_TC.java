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
public class Register_TC extends Base_Test {
	
	
	@DataProvider(name= "Testdata")
	public Object[][] testdata() throws IOException
	{
		Object[][] data = Utility_Methods.getTestData("Register");
		/*data[0][0]="rakesh";
		data[0][1]="b";
		data[0][2]="rakesh75@gmaiz.com";
		data[0][3]="6362606708";
		data[0][4]="6362606708";*/
		
		return data;
		
	}

	@Test(dataProvider = "Testdata")
	public void register(String FN,String LN, String email, String password, String confirmPassword)
	{
		
		WebElement register_lnk=d.findElement(By.xpath("//a[@class=\"ico-register\"]"));
		Utility_Methods.Click_Element(register_lnk);
		
		WebElement radio_button=d.findElement(By.xpath("//input[@id=\"gender-male\"]"));
		Utility_Methods.Click_Element(radio_button);
		
		
		WebElement Firstname_feild=d.findElement(By.xpath("//input[@id=\"FirstName\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(Firstname_feild, FN);
		
		WebElement Lastname_feild=d.findElement(By.xpath("//input[@id=\"LastName\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(Lastname_feild, LN);
		
		WebElement email_feild=d.findElement(By.xpath("//input[@id=\"Email\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(email_feild,email );
		
		WebElement password_feild=d.findElement(By.xpath("//input[@id=\"Password\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(password_feild, password);
		
		WebElement confirm_feld=d.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(confirm_feld, confirmPassword);
		
		WebElement submit_button= d.findElement(By.xpath("//input[@id=\"register-button\"]"));
		Utility_Methods.Click_Element(submit_button);
		
		WebElement continue_button = d.findElement(By.xpath("//input[@value=\"Continue\"]"));
		Utility_Methods.Click_Element(continue_button);
		
		WebElement logout_button = d.findElement(By.xpath("//a[@class=\"ico-logout\"]"));
		Utility_Methods.Click_Element(logout_button);
		
		
		Utility_Methods.Click_Element(register_lnk);
		
		
	}
	
}
