package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WW_IFRAMES {

	public WW_IFRAMES() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/Rakesh/Desktop/SELENIUM/HTML/iframe.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.switchTo().frame(0);
		d.findElement(By.cssSelector("a[class=\"ico-login\"]")).click();
		
		
	}

}
