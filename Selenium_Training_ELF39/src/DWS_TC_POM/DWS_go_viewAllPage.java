package DWS_TC_POM;

import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import POM_DWS.DWS_HomePage;

public class DWS_go_viewAllPage extends Base_Test{

	public DWS_go_viewAllPage() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void viewAll()
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.click_viewAll_link();
	}
	

}