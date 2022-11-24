package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WEBDRIVER_WAIT {

	public WEBDRIVER_WAIT() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(d,6);
		d.findElement(By.cssSelector("input[value=\"Search store\"]")).sendKeys("comp");
		
		
		
		
	}
 
}
