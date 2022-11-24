package Basics_Assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TEST {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		   
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.linkText("Wishlist")).click();
		d.findElement(By.tagName("img")).click();
		
		
		
		
		
		
		
		
	}

}
