package DWS_TC_POM;

import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import POM_DWS.DWS_HomePage;

public class DWS_Subscribe extends Base_Test {

	public DWS_Subscribe() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void subscribe()
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.sendKeys_to_subscribe_feild("rakeshbhaskaran@gmail.com");
		hp.click_subscribe_button();
	}

}
