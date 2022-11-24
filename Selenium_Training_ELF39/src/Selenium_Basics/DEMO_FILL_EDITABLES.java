package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO_FILL_EDITABLES { // in demo html fill all the editables
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///F:/HTML/demo.html");
		d.manage().window().maximize();
		List<WebElement> editables=d.findElements(By.xpath("//input[@type=\"text\"]"));
		editables.add(d.findElement(By.xpath("//input[@name=\"  spam\"]")));
		editables.add(d.findElement(By.xpath("//input[@id=\"last_name\"]")));
		String a[]= {"rak","chi","amb","magu","pra","nim","gum","bum","pol","fat","fit","kiu","few"};
		
		for(int i=0;i<editables.size();i++)
		{
			editables.get(i).sendKeys(a[i]);
		}
		
	}

}
