package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//Launch the firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		
		
		
	}

}
