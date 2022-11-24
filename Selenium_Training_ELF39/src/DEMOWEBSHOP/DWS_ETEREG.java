package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_ETEREG {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.linkText("Register")).click();
		d.findElement(By.cssSelector("input[id=\"gender-male\"]")).click();
		d.findElement(By.id("FirstName")).sendKeys("jaideep");
		d.findElement(By.id("LastName")).sendKeys("b");
		d.findElement(By.id("Email")).sendKeys("jaideep07@gmail.com");
		d.findElement(By.id("Password")).sendKeys("6362606708");
		d.findElement(By.id("ConfirmPassword")).sendKeys("6362606708");
		d.findElement(By.cssSelector("input[class=\"button-1 register-next-step-button\"]")).click();
		
	}

}
