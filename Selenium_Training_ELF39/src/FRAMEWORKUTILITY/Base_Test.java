package FRAMEWORKUTILITY;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Test {
public WebDriver d;
	@BeforeClass
	public void BrowserSetup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		d = new ChromeDriver();
		String url =Utility_Methods.test_configuration();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void Teardown()
	{
		d.close();
	}
	
	

}
