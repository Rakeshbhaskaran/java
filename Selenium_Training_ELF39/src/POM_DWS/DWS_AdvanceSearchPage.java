package POM_DWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import FRAMEWORKUTILITY.Utility_Methods;

public class DWS_AdvanceSearchPage extends Utility_Methods{

	public DWS_AdvanceSearchPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@id=\\\"small-searchterms\\\"]")
	WebElement search_feild;
	
	@FindBy(xpath="//input[@type=\\\"submit\\\"]")
	WebElement search_button;
	
	@FindBy(xpath="//input[@id=\"As\"]")
	WebElement adv_srch_checkbox;
	
	@FindBy(xpath="//select[@id=\"Cid\"]")
	WebElement category_dropdown;
	
	@FindBy(xpath="//input[@id=\"Isc\"]")
	WebElement auto_srch_checkbox;
	
	@FindBy(xpath="//select[@id=\"Mid\"]")
	WebElement mfd_dropdown;
	
	@FindBy(xpath="//input[@id=\"Pf\"]")
	WebElement start_value;
	
	@FindBy(xpath="//input[@id=\"Pt\"]")
	WebElement end_value;
	
	@FindBy(xpath="//input[@id=\"Sid\"]")
	WebElement product_search_checkbox;
	
	@FindBy(xpath="(//input[@type=\"submit\"])[2]")
	WebElement search_button1;
	
	public void send_username(String value)
	{
		search_feild.sendKeys(value);
	}
	public void click_search_button()
	{
		search_button.click();
	}
	public void click_adv_srch_checkbox()
	{
		adv_srch_checkbox.click();
	}
	public void select_from_cate_dropdown( String value)
	{
		drop_down_select_by_visibleText(category_dropdown, value);
	}
	public void click_auto_srch_checkbox()
	{
		auto_srch_checkbox.click();
	}
	public void select_from_mfd_dropdown( String value)
	{
		drop_down_select_by_visibleText(mfd_dropdown, value);
	}
	public void send_start_value(String value)
	{
		start_value.sendKeys(value);
	}
	public void send_end_value(String value)
	{
		end_value.sendKeys(value);
	}
	public void click_product_search_checkbox()
	{
		product_search_checkbox.click();
	}
	public void click_search_button1()
	{
		search_button1.click();
	}
	
	
}
	
