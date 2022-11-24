package POM_DWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FRAMEWORKUTILITY.Utility_Methods;

public class DWS_WishlistPage extends Utility_Methods{

	public DWS_WishlistPage(WebDriver d)  {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//div[@class=\"wishlist-content\"]")
	WebElement display;
	
	
	
	

}
