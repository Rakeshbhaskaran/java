package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DWS_25_ActionClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://demowebshop.tricentis.com/");
	d.manage().window().maximize();
	Actions action = new Actions(d);
	action.moveToElement(d.findElement(By.xpath("(//a[contains(text(),'Elect')])[1]"))).build().perform();
	action.moveToElement(d.findElement(By.xpath("(//a[contains(text(),'Cell')])[1]"))).click().perform();

	
	
	
	
	
	
	
}
}
