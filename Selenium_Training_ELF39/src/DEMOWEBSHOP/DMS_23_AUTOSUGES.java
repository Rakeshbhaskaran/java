package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DMS_23_AUTOSUGES {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.xpath("//input[@value='Search store']")).sendKeys("comp");
		Thread.sleep(5000);
		//d.findElement(By.xpath("//ul[@id=\"ui-id-1\"]/li[3]/a")).click();
		d.findElement(By.cssSelector("a[id=\"ui-id-4\"]")).click();
		
		
	}

}
