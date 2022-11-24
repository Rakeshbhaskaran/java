package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_FILL_ALT_EDITABLES { // fill alternate editables
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///F:/HTML/demo.html");
		d.manage().window().maximize();
		List<WebElement> editables=d.findElements(By.xpath("//input[@type=\"text\"]"));
		editables.add(d.findElement(By.xpath("//input[@name=\"  spam\"]")));
		editables.add(d.findElement(By.xpath("//input[@id=\"last_name\"]")));
		
		for(int i=0;i<editables.size();i++)
		{
			if(i%2!=0)
			{
			editables.get(i).sendKeys(i+1+"");
			}
			
		}
		
	}

}
