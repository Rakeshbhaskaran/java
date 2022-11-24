package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DMS_REGVAL {

	public DMS_REGVAL() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.linkText("Register")).click();
		d.findElement(By.cssSelector("input[id=\"gender-male\"]")).click();
		d.findElement(By.id("FirstName")).sendKeys("hansika");
		d.findElement(By.id("LastName")).sendKeys("b");
		d.findElement(By.id("Email")).sendKeys("hansika01@gmail.com");
		d.findElement(By.id("Password")).sendKeys("6362606708");
		d.findElement(By.id("ConfirmPassword")).sendKeys("6362606708");
		d.findElement(By.cssSelector("input[class=\"button-1 register-next-step-button\"]")).click();
		String expectedString = "Your registration completed";
		String actualString =d.findElement(By.className("result")).getText();
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
