package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_ALERT1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		d.manage().window().maximize();
		List<WebElement> list = d.findElements(By.xpath("//span[contains(text(),'Edit')]/../../li/span"));
		Actions action = new Actions(d);
		for(WebElement o:list)
		{
		action.contextClick(d.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
		Thread.sleep(1000);
		o.click();
		Thread.sleep(1000);
		Alert ale= d.switchTo().alert();
		ale.accept();
		}
		d.close();
		
		
	}

}
