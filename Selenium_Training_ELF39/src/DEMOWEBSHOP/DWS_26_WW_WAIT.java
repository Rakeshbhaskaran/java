package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS_26_WW_WAIT {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(d,25);
		wait.until(ExpectedConditions.visibilityOf(d.findElement(By.xpath("//a[@class=\"ico-register\"]"))));
		d.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		wait.until(ExpectedConditions.visibilityOf(d.findElement(By.xpath("//input[@id=\"gender-male\"]"))));
		d.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		d.close();
		
		
		
		
		
	}

}
