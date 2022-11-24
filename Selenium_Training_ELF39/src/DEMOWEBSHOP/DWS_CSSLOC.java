package DEMOWEBSHOP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DWS_CSSLOC {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("computer");
		d.findElement(By.cssSelector("input[class=\"button-1 search-box-button\"]")).click();
		
		
	}
	

}
