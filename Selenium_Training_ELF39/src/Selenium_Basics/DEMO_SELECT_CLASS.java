package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DEMO_SELECT_CLASS {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///F:/HTML/demo.html");
		WebElement f=d.findElement(By.id("standard_cars"));
		Select s = new Select(f);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("hda");
		Thread.sleep(1000);
		s.selectByVisibleText("BMW");
		
		
	}

}
