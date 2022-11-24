package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Monster {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.monsterindia.com/");
		Actions action = new Actions(d);
		action.moveToElement(d.findElement(By.xpath("(//a[@data-check=\"menutab\"])[1]"))).build().perform();
		action.moveToElement(d.findElement(By.xpath("(//a[contains(text(),'Jobs by Skills')])[1]"))).build().perform();
		action.moveToElement(d.findElement(By.xpath("(//a[@href=\"https://www.monsterindia.com/search/java-jobs\"])[1]"))).click().perform();
		
		
	}

}
