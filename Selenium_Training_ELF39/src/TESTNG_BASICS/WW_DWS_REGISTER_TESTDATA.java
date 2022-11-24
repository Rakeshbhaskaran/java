package TESTNG_BASICS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;

public class WW_DWS_REGISTER_TESTDATA{

	@DataProvider(name= "Testdata")
	public Object[][] testdata()
	{
		Object[][] data = new Object[5][5];
		data[3][0]="rakesh";
		data[0][1]="b";
		data[0][2]="rake75@gmaiz.com";
		data[0][3]="6362606708";
		data[0][4]="6362606708";
		
		data[1][0]="jaideep";
		data[1][1]="b";
		data[1][2]="rake78@gmaiz.com";
		data[1][3]="6362606708";
		data[1][4]="6362606708";
		
		data[2][0]="hansika";
		data[2][1]="b";
		data[2][2]="rake79@gmaiz.com";
		data[2][3]="6362606708";
		data[2][4]="6362606708";
		
		data[0][0]="chinmayi";
		data[3][1]="b";
		data[3][2]="rake90@gmaiz.com";
		data[3][3]="6362606708";
		data[3][4]="6362606708";
		
		data[4][0]="gundoo";
		data[4][1]="b";
		data[4][2]="rake91@gmaiz.com";
		data[4][3]="6362606708";
		data[4][4]="6362606708";
		return data;
		
	}
	
	@Test(dataProvider = "Testdata")
	public void register(String FN,String LN, String E, String P,String CP) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		d.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		d.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys(FN);
		d.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys(LN);
		d.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(E);
		d.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(P);
		d.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys(CP);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
		d.close();
		
	}

}
