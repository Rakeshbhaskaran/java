package Basics_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Test1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("books");
		d.findElement(By.cssSelector("input[class=\"button-1 search-box-button\"]")).click();
		
	}

}
