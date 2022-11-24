package TESTNG_BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WW_BASICS1 {

	public WW_BASICS1() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void demo()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("books");
		d.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		
	}

}
