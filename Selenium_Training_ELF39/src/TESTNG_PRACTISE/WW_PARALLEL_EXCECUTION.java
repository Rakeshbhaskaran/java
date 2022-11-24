package TESTNG_PRACTISE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WW_PARALLEL_EXCECUTION {

	@Test(invocationCount = 6,threadPoolSize = 3)
	public void trail()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.close();
	}
	

}
