package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_PRSTR { // print String from web elements
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		
		String b =d.findElement(By.className("ico-register")).getText();
		System.out.println(b);
		
		String a =d.findElement(By.cssSelector("img[src=\"/Themes/DefaultClean/Content/images/logo.png\"]")).getText();
		System.out.println(a);
		System.out.println("hi");
		d.findElement(By.className("ico-register")).click();
		d.findElement(By.cssSelector("img[src=\"/Themes/DefaultClean/Content/images/logo.png\"]")).click();
		String c=d.findElement(By.cssSelector("input[class=\"button-1 search-box-button\"]")).getText();
		System.out.println(c);
		System.out.println("bye");
		
	}

}
