package DWS_TC_POM;

import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import POM_DWS.DWS_ContactUsPage;
import POM_DWS.DWS_HomePage;

public class DWS_ContactUs extends Base_Test {

	public DWS_ContactUs() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void contactUs()
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.click_contactUs_button();
		
		DWS_ContactUsPage cup = new DWS_ContactUsPage(d);
		cup.sendTo_fullname_feild("rakesh  b");
		cup.sendTo_email_feild("rakesh@gmail.com");
		cup.sendTo_textArea_feild(" jsfusaf gsagcgas");
		cup.click_submitButton();
		
		
	}

}
