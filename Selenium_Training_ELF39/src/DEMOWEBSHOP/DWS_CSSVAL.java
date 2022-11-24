package DEMOWEBSHOP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DWS_CSSVAL {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		String css_value =d.findElement(By.className("ico-register")).getCssValue("height");
		System.out.println(css_value);
		d.close();
		
		
		
		
	}

}
