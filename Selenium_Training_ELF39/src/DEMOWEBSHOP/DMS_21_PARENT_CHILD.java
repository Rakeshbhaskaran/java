package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DMS_21_PARENT_CHILD {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.partialLinkText("Computers")).click();
		d.findElement(By.partialLinkText("Desktops")).click();
		d.findElement(By.xpath("//a[text()=\"Build your own cheap computer\"]/../../../div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@data-productid=\"72\"]")).click();
		
		
	}

}
