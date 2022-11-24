package POM_DWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FRAMEWORKUTILITY.Utility_Methods;

public class DWS_TwiiterPage extends Utility_Methods{

	public DWS_TwiiterPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement login_button;
	
	public void click_login()
	{
		Click_Element(login_button);
	}
	
	

}
