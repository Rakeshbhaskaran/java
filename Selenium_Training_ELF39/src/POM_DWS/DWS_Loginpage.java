package POM_DWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Loginpage {

	public DWS_Loginpage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@class=\"email\"]")
	WebElement email_feild;
	
	@FindBy(xpath="//input[@class=\"password\"]")
	WebElement password_feild;
	
	@FindBy(xpath="(//input[@type=\"submit\"])[2]")
	WebElement login_button;
	
	public void send_username(String value)
	{
		email_feild.sendKeys(value);
	}
	
	public void send_password(String value)
	{
		password_feild.sendKeys(value);
	}
	
	public void clicl_login_button()
	{
		login_button.click();
	}
}
