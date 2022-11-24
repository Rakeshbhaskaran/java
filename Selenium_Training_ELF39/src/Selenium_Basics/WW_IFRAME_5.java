package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WW_IFRAME_5 {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/Rakesh/Desktop/SELENIUM/HTML/iframe.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@id=\"FR1\"]")));
		d.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//a[@href=\"http://google.com\"]")).click();
		
	}
}
