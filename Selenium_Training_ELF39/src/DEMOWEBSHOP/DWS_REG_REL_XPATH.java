package DEMOWEBSHOP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_REG_REL_XPATH {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver d = new  ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[@href=\"/register\"]")).click();
		d.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		d.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("rakesh");
		d.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("b");
		d.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("rak01@gmail.com");
		d.findElement(By.xpath("(//input[@data-val=\"true\"])[4]")).sendKeys("6362606708");
		d.findElement(By.xpath("(//input[@data-val=\"true\"])[5]")).sendKeys("6362606708");
		d.findElement(By.xpath("//input[@value=\"Register\"]")).click();
		
		
		
		
		
	}

}
