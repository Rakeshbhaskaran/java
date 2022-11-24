package DEMOWEBSHOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DWS_SORT_PRINTOPTIONS {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.xpath("(//a[@href=\"/books\"])[1]")).click();
		WebElement sort_by =d.findElement(By.id("products-orderby"));
		Select sortby = new Select(sort_by);
		sortby.selectByIndex(3);
		
		WebElement display =d.findElement(By.id("products-pagesize"));
		Select dis = new Select(display);
		dis.selectByIndex(2);
		
		WebElement view_as =d.findElement(By.id("products-viewmode"));
		Select v = new Select(view_as);
		
		v.selectByVisibleText("List");
		//sortby.selectByIndex(3);
		//dis.selectByIndex(2);
		//v.selectByVisibleText("List");
		
		
	}

}
