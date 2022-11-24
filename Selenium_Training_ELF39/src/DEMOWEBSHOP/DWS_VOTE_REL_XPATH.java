package DEMOWEBSHOP;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DWS_VOTE_REL_XPATH {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
		d.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("rak01@gmail.com");
		d.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("6362606708");
		d.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
		
		
		d.findElement(By.xpath("//input[@id=\"pollanswers-3\"]")).click();
		d.findElement(By.xpath("//input[@id=\"vote-poll-1\"]")).click();
	}

}
