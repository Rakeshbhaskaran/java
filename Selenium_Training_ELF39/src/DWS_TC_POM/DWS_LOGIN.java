package DWS_TC_POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import FRAMEWORKUTILITY.Utility_Methods;
import POM_DWS.DWS_HomePage;
import POM_DWS.DWS_Loginpage;

public class DWS_LOGIN extends Base_Test {

	
	

	@DataProvider(name = "DataProvider")
	public Object[][] testdata() throws IOException
	{
		Object[][] data= Utility_Methods.getTestData("Login");
		return data;
	}
	
	@Test(dataProvider = "DataProvider")
	public void login(String username, String password)
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.click_login();
		
		DWS_Loginpage lp = new DWS_Loginpage(d);
		lp.send_username(username);
		lp.send_password(password);
		lp.clicl_login_button();
		
		
	}
	
	
	

}
