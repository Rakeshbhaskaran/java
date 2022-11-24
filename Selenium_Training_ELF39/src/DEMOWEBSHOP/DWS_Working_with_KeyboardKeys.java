package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DWS_Working_with_KeyboardKeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		WebElement search =d.findElement(By.cssSelector("input[id='small-searchterms']"));
		Actions action = new Actions(d);
		//action.moveToElement(search).click().sendKeys("mobile").perform();
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		//action.sendKeys(search,"mobile").perform();
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		action.moveToElement(search).click().perform();
		//action.keyDown(Keys.LEFT_SHIFT).sendKeys("chinmay").keyUp(Keys.LEFT_SHIFT).perform();
		action.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).perform(); 
	}

}
