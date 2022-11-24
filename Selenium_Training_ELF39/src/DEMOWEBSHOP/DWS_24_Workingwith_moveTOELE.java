package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DWS_24_Workingwith_moveTOELE {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		WebElement electronics =d.findElement(By.xpath("(//a[contains(text(),'Elec')])[1]"));
		Actions actions=new Actions(d);
		actions.moveToElement(electronics).build().perform();
	}
	

}
