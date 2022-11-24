package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_ATTRI {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		String a =d.findElement(By.id("small-searchterms")).getAttribute("value");
		System.out.println(a);
		d.findElement(By.id("small-searchterms")).sendKeys("books");
		String b =d.findElement(By.id("small-searchterms")).getAttribute("value");
		System.out.println(b);
		String c=d.findElement(By.linkText("Shopping cart")).getAttribute("color");
		System.out.println(c);
		d.close();
		
	}

}
