package Selenium_Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class working_with_Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		d.manage().window().maximize();
		WebElement r =d.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Actions action = new Actions(d);
		action.doubleClick(r).build().perform();
		Thread.sleep(3000);
		Alert ale= d.switchTo().alert();
		ale.accept();
	}

}
