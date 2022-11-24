package TESTCASE1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WW_PARAMETER_1 {
	@Parameters({"URL","DATA"})
	@Test
	public void search(String url,String data) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys(data);
		d.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		d.close();
	}

}
