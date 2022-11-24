package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class REL_XPATH {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///F:/HTML/xpath1.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("(//input)[1]")).sendKeys("rakesh");
		d.findElement(By.xpath("(//input)[2]")).sendKeys("b");
		d.findElement(By.xpath("(//input)[3]")).sendKeys("test yantra");
		d.findElement(By.xpath("(//input)[4]")).sendKeys("banashankari");
	}

}
