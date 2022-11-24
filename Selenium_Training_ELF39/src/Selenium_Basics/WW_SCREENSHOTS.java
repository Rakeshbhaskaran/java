package Selenium_Basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WW_SCREENSHOTS {

	public WW_SCREENSHOTS() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts =(TakesScreenshot)d;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File s1= new File("./ScreenShots/s1.png");
		FileHandler.copy(ss, s1);
		
		d.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		d.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("rak456@gmail.com");
		d.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys("6362606708");
		d.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
		
		File ss1=ts.getScreenshotAs(OutputType.FILE);
		File s2= new File("./ScreenShots/s2.png");
		FileHandler.copy(ss1, s2);
		d.close();
		
		
		
		
		
	}

}
