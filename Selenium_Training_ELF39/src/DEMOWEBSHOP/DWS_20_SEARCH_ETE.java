package DEMOWEBSHOP;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DWS_20_SEARCH_ETE {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.out.println("Enter email to register");
		Scanner a1= new Scanner(System.in);
		String email=a1.next();
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		register(d,email);
		logOut(d);
		logIn(d,email);
		books(d);
		d.close();
		
		
	}
		static void register(WebDriver d, String email)
		{
		d.findElement(By.linkText("Register")).click();
		d.findElement(By.id("gender-male")).click();
		d.findElement(By.id("FirstName")).sendKeys("hansika");
		d.findElement(By.id("LastName")).sendKeys("b");
		d.findElement(By.id("Email")).sendKeys(email);
		d.findElement(By.id("Password")).sendKeys("6362606708");
		d.findElement(By.id("ConfirmPassword")).sendKeys("6362606708");
		d.findElement(By.id("register-button")).click();
		
		}
		static void logOut(WebDriver d)
		{
			d.findElement(By.linkText("Log out")).click();
		}
		static void logIn(WebDriver d,String email)
		{
			d.findElement(By.linkText("Log in")).click();
			d.findElement(By.id("Email")).sendKeys(email);
			d.findElement(By.id("Password")).sendKeys("6362606708");
			d.findElement(By.cssSelector("input.button-1.login-button")).click();
		}
		static void books(WebDriver d)
		{
			d.findElement(By.partialLinkText("Books")).click();
			WebElement sort_by = d.findElement(By.id("products-orderby"));
			Select sort = new Select(sort_by);
			sort.selectByIndex(1);
			List<WebElement> book =d.findElements(By.xpath("//h2[@class=\"product-title\"]/a"));
			for(int i=0;i<book.size();i++)
			{
				System.out.println(book.get(i).getText());
			}
			
		}
		
		
		
		
		
		
	

}
