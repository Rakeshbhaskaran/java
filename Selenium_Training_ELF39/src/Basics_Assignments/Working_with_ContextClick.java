package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_ContextClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions action = new Actions(d);
		action.contextClick(d.findElement(By.xpath("//span[contains(text(),'right')]"))).build().perform();
		
	}

}
