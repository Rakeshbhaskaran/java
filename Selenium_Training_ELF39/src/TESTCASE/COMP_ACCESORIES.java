package TESTCASE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import FRAMEWORKUTILITY.Utility_Methods;

public class COMP_ACCESORIES extends Base_Test {

	@Test
	public void comp()
	{
		
		
		WebElement computer_tab=d.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
		Utility_Methods.moveTOElement(computer_tab, d);
		
		WebElement accessories= d.findElement(By.xpath("//a[@href=\"/accessories\"]"));
		Utility_Methods.Click_Element(accessories);
		
	}
	

}
