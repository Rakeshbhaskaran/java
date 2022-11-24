package PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public Implicit_Wait() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		d.findElement(By.cssSelector("input[value=\"Search store\"]")).sendKeys("comp");
		d.findElement(By.xpath("(//a[@tabindex=\"-1\"])[3]")).click();
		
	}

}
