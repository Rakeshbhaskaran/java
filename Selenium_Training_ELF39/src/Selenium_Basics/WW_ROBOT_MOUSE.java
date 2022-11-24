package Selenium_Basics;



import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WW_ROBOT_MOUSE {

	public WW_ROBOT_MOUSE() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		Point location = d.findElement(By.xpath("(//a[@href=\"/books\"])[1]")).getLocation();
		Robot robot = new Robot();
		robot.mouseMove(280, 320);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		WebElement ele = d.findElement(By.xpath("(//a[@href=\"/books\"])[1]"));
		File t=ele.getScreenshotAs(OutputType.FILE);
		File t1 = new File("./ScreenShots/t1.png");
		FileHandler.copy(t, t1);
		
		
		
		
		
		
	}

}
