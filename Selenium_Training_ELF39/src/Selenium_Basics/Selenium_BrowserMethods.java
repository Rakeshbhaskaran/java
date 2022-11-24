package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//Launch the firefox browser
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Register")).click();
			driver.close();
			
			
	}

}