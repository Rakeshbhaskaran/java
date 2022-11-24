package POM_DWS;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import FRAMEWORKUTILITY.Utility_Methods;

public class DWS_HomePage extends Utility_Methods{

	public DWS_HomePage(WebDriver d) {
		
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//a[@class=\"ico-login\"]")
	public WebElement login_link;
	
	@FindBy(xpath="//input[@id=\"small-searchterms\"]")
	WebElement search_feild;
	
	@FindBy(xpath="(//input[@type=\"submit\"])[1]")
	WebElement search_button;
	
	@FindBy(xpath="(//input[@name=\"pollanswers-1\"])[1]")
	WebElement Excellent_radiobutton;
	
	@FindBy(xpath="//input[@id=\"vote-poll-1\"]")
	WebElement votebutton;
	
	@FindBy(xpath="(//a[@href=\"/books\"])[3]")
	WebElement books_link;
	
	@FindBy(xpath="(//a[@class=\"ico-cart\"])[1]")
	WebElement shoppingCart_button;
	
	@FindBy(xpath="(//a[@class=\"ico-wishlist\"])[1]")
	WebElement Wishlist_link;
	
	@FindBy(xpath="//input[@value=\"Subscribe\"]")
	WebElement subscribe_button;
	
	@FindBy(xpath="//input[@id=\"newsletter-email\"]")
	WebElement subscribe_feild;
	
	@FindBy(xpath="(//a[@target=\"_blank\"])[2]")
	WebElement twiiter_link;
	
	@FindBy(xpath="(//a[@href=\"/computers\"])[1]")
	WebElement computer_tab;
	
	@FindBy(xpath="(//a[@href=\"/notebooks\"])[1]")
	WebElement noteBook_button;
	
	@FindBy(xpath="//a[@href=\"/contactus\"]")
	WebElement contactUs_link;
	
	@FindBy(xpath="//a[@href=\"/tricentis\"]")
	WebElement tricentis_link;
	
	@FindBy(xpath="(//a[@href=\"/digital-downloads\"])[1]")
	WebElement digitalDownload_tab;
	
	@FindBy(xpath="//a[@href=\"/producttag/all\"]")
	WebElement viewAll_link;
	
	@FindBy(xpath="//a[@href=\"/privacy-policy\"]")
	WebElement privacyNotice_link;
	
	public void click_login()
	{
		login_link.click();
	}
	public void sendKeys_to_search_feild(String value)
	{
		Enter_Value_To_EditFeild(search_feild, value);
	}
	public void click_search_button()
	{
		Click_Element(search_button);
	}
	public void vote_Excellent()
	{
		Click_Element(Excellent_radiobutton);
		Click_Element(votebutton);
	}
	public void click_book_link()
	{
		Click_Element(books_link);
	}
	public void click_shoppingCart_buuton()
	{
		Click_Element(shoppingCart_button);
	}
	public void click_Wishlist_link()
	{
		Click_Element(Wishlist_link);
	}
	public void sendKeys_to_subscribe_feild(String value)
	{
		Enter_Value_To_EditFeild(subscribe_feild, value);
	}
	public void click_subscribe_button()
	{
		Click_Element(subscribe_button);
	}
	
	public void click_twitterlink()
	{
		Click_Element(twiiter_link);
	}
	public void click_computerTab()
	{
		Click_Element(computer_tab);
	}
	
	public void moveToComputer_tab( WebDriver d)
	{
		moveTOElement(computer_tab,d);
	}
	public void click_noteBook_button()
	{
		Click_Element(noteBook_button);
	}
	public void click_contactUs_button()
	{
		Click_Element(contactUs_link);
	}
	public void click_tricentis()
	{
		tricentis_link.click();
	}
	public void click_digitalDownloads()
	{
		digitalDownload_tab.click();
	}
	public void click_viewAll_link()
	{
		viewAll_link.click();
	}
	public void click_privacyNotice_link()
	{
		Click_Element(privacyNotice_link);
	}
	

}
