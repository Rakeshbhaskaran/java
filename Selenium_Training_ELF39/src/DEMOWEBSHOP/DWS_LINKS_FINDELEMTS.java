package DEMOWEBSHOP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_LINKS_FINDELEMTS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		List<WebElement>links =d.findElements(By.xpath("//a"));
		System.out.println("number of links "+links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(i+1+" "+links.get(i).getText());
		
			
		}
		d.close();
	}

}
