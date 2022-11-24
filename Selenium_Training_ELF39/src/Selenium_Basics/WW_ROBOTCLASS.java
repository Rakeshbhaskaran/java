package Selenium_Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WW_ROBOTCLASS {

	public WW_ROBOTCLASS() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/Rakesh/Desktop/SELENIUM/HTML/demo.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		Actions action = new Actions(d);
		action.moveToElement(d.findElement(By.xpath("//input[@id=\"resume\"]"))).click().perform();
		Thread.sleep(6000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		
		for(int i=0;i<=2;i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
