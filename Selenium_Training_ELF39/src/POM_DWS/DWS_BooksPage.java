package POM_DWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FRAMEWORKUTILITY.Utility_Methods;

public class DWS_BooksPage extends Utility_Methods{

	public DWS_BooksPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@value=\"Add to cart\"]")
	WebElement computerinternet_book;

	
	public void addToCart_comp_internet_book ()
	{
		Click_Element(computerinternet_book);
	}
}
