package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import FRAMEWORKUTILITY.Utility_Methods;

public class test_configuration_practice extends Base_Test{

	public test_configuration_practice() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void demo()
	{
		WebElement login_lnk=d.findElement(By.xpath("//a[@href=\"/login\"]"));
		Utility_Methods.Click_Element(login_lnk);
		
		
		WebElement email_feild=d.findElement(By.xpath("//input[@id=\"Email\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(email_feild, email);
		
		WebElement password_feild=d.findElement(By.xpath("//input[@id=\"Password\"]"));
		Utility_Methods.Enter_Value_To_EditFeild(password_feild, password);
		
		
		WebElement submit_button=d.findElement(By.xpath("(//input[@type=\"submit\"])[2]"));
		Utility_Methods.Click_Element(submit_button);
	}

}
