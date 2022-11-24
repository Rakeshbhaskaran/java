package PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSRTC {

	public KSRTC() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://ksrtc.in/oprs-web/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//input[@id=\"fromPlaceName\"]")).sendKeys("bangalore");
		d.findElement(By.xpath("(//a[text()='BANGALORE'])[1]")).click();
		
		d.findElement(By.xpath("//input[@id=\"toPlaceName\"]")).sendKeys("chennai");
	}
	

}
