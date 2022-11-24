package DWS_TC_POM;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import FRAMEWORKUTILITY.Utility_Methods;
import POM_DWS.DWS_HomePage;

public class DWS_SEARCH extends Base_Test  {

	public DWS_SEARCH() {
		// TODO Auto-generated constructor stub
	}
	@DataProvider(name = "data")
	public Object[][] testdata() throws IOException
	{
		Object[][] data = Utility_Methods.getTestData("SEARCH");
		return data;
	}
	@Test(dataProvider = "data")
	public void search(String value)
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.sendKeys_to_search_feild(value);
		hp.click_search_button();
	}
	
	
	

}
