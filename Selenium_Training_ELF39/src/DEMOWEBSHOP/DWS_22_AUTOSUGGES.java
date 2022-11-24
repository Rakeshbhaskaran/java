package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_22_AUTOSUGGES {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("ind");
		Thread.sleep(3000);
		d.findElement(By.xpath("//li[@class=\"ui-menu-item\"]/div[text()='India']")).click();
		
	}

}
