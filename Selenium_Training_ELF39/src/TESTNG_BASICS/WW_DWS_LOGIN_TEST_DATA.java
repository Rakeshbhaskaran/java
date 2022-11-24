package TESTNG_BASICS;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WW_DWS_LOGIN_TEST_DATA {

	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object [][] data = new Object[5][2];
		data[0][0]="rake75@gmaiz.com";
		data[0][1]="6362606708";
		
		data[1][0]="rake78@gmaiz.com";
		data[1][1]="6362606708";
		
		data[2][0]="rake79@gmaiz.com";
		data[2][1]="6362606708";
		
		data[3][0]="rake90@gmaiz.com";
		data[3][1]="6362606708";
		
		data[4][0]="rake91@gmaiz.com";
		data[4][1]="6362606708";
		
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void login(String email, String password) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		d.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		d.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys(email);
		d.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys(password);
		d.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
		
		TakesScreenshot ts = (TakesScreenshot) d;
		File ss =ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("./ScreenShots/ch.png");
			FileHandler.copy(ss, destination);
		
			Thread.sleep(2000);
		
		d.close();
		
	}

}
