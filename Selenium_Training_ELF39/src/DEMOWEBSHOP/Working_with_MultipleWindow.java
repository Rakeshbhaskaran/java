package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_MultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		String a1=d.getWindowHandle();

		d.findElement(By.xpath("//a[contains(text(),'Faceb')]")).click();
		Thread.sleep(3000);
		//d.switchTo().window(a1)
		String a2=d.getWindowHandle();
		System.out.println(a1+" "+a2);
		//d.findElement(By.id("email")).sendKeys("rakeshbhaskaran");
	}

}
