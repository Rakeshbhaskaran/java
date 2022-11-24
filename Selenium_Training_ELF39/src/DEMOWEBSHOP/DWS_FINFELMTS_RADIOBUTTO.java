package DEMOWEBSHOP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_FINFELMTS_RADIOBUTTO {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		List<WebElement>radio_button =d.findElements(By.xpath("//input[@type=\"radio\"]"));
		for(int i=0;i<radio_button.size();i++)
		{
			radio_button.get(i).click();
				Thread.sleep(1000);
		}
		
	}

}
