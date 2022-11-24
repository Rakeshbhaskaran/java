package Basics_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUsingNavig {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.wikipedia.org/");
		d.manage().window().maximize();
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		d.get("https://www.linkedin.com");
		d.close();
		
		
		
		
	}

}
