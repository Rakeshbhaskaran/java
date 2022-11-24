package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DMS_LOGVAL {

	public DMS_LOGVAL() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.className("ico-login")).click();
		
		d.findElement(By.id("Email")).sendKeys("hansika07@gmail.com");
		d.findElement(By.id("Password")).sendKeys("6362606708");
		d.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		String actualString=d.findElement(By.className("account")).getText();
		String expectedString = "hansika07@gmail.com";
		
		if(expectedString.equals(actualString))
		{
			System.out.println("validation pass");
		}
		else
		{
			System.out.println("validation fail");
		}
		d.close();
	}

}
