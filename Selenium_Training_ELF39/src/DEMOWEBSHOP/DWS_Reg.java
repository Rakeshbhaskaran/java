package DEMOWEBSHOP;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Reg {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver w = new ChromeDriver(); 
		w.manage().window().maximize();
		
		w.get("https://demowebshop.tricentis.com/");
		w.findElement(By.linkText("Register")).click();
		w.findElement(By.id("FirstName")).sendKeys("rakesh");
		w.findElement(By.name("LastName")).sendKeys("b");
		w.findElement(By.id("Email")).sendKeys("rakeshbhaskaran07@gmail.com");
		
		//w.close();
		
		
		
		
	}

}
