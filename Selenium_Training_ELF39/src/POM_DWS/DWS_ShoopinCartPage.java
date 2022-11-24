package POM_DWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import FRAMEWORKUTILITY.Utility_Methods;

public class DWS_ShoopinCartPage extends Utility_Methods{

	public DWS_ShoopinCartPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//tr[@class=\"cart-item-row\"]/td[1]/input")
	WebElement product_CheckBox;
	
	@FindBy(xpath="//input[@name=\"termsofservice\"]")
	WebElement terms_CheckBox;
	
	@FindBy(xpath="//button[@id=\"checkout\"]")
	WebElement checkOut_button;
	
	public void select_Product_CheckBox()
	{
			Click_Element(product_CheckBox);
	}
	
	public void select_Terms_CheckBox()
	{
		Click_Element(terms_CheckBox);
	}
	
	public void select_checkOut_Button()
	{
		Click_Element(checkOut_button);
	}

}
