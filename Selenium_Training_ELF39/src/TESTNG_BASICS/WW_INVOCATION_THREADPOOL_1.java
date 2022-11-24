package TESTNG_BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WW_INVOCATION_THREADPOOL_1 {

	@Test(invocationCount = 3,threadPoolSize = 3)
	public void search()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("books");
		d.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		d.close();
	}

}
