package DEMOWEBSHOP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_FINDELEMTS_BUTTONS {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		List<WebElement>buttons =d.findElements(By.xpath("//input[@type=\"button\"]"));
		for(int i=0;i<buttons.size();i++)
		{
			System.out.println(buttons.get(i).getAttribute("value"));
		}
		d.close();
		
		
	}

}
