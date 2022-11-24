package Basics_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class ASSIGNEMENT_1 {

	public ASSIGNEMENT_1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@value=\"radio2\"]")).click();
		d.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("ind");
		d.findElement(By.xpath("(//div[text()='India'])[1]")).click();
		Select select =new Select(d.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]")));
		select.selectByIndex(1);
		d.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]")).click();
		
		d.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
		Set<String> windows =d.getWindowHandles();
		String parentWindow=d.getWindowHandle();
		String parentTitle = d.getTitle(); 
		for(String i:windows) {
			String title = d.switchTo().window(i).getTitle();
			System.out.println(title);
			if(d.getTitle().equalsIgnoreCase("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy"))
			{
				d.findElement(By.linkText("Register")).click();
				d.close();
			}
		}
		d.switchTo().window(parentWindow);
		d.findElement(By.xpath("//a[@id=\"opentab\"]")).click();
		Set<String> tabs=d.getWindowHandles();
		for(String j:tabs)
		{
			String tabtitle=d.switchTo().window(j).getTitle();
			if(tabtitle.equalsIgnoreCase("Rahul Shetty Academy"))
			{
				d.switchTo().window(j);
				d.findElement(By.xpath("//span[@class=\"fa fa-linkedin\"]")).click();
				d.close();
			}
		}
		d.switchTo().window(parentWindow);
		
		Actions action = new Actions(d);
		action.moveToElement(d.findElement(By.xpath("//button[@id=\"mousehover\"]"))).build().perform();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class=\"mouse-hover\"]/div/a[1]")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Raksh b");
		d.findElement(By.xpath("//input[@id=\"confirmbtn\"]")).click();
		Thread.sleep(2000);
		Alert ale = d.switchTo().alert();
		ale.dismiss();
		Thread.sleep(2000);
		
		d.switchTo().frame(0);
		d.findElement(By.xpath("(//a[@href=\"learning-path\"])[1]")).click();
		d.switchTo().defaultContent();
		
		System.out.println(d.findElement(By.xpath("(//tbody)[1]/tr[11]/td[3]")).getText());
		
		TakesScreenshot ts =  (TakesScreenshot)d;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File a1= new File("./ScreenShots/a1.png");
		FileHandler.copy(ss, a1);
		
		
		
		
		d.close();
		
	}

}
