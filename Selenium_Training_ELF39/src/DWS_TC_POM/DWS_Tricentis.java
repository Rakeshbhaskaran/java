package DWS_TC_POM;

import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import POM_DWS.DWS_HomePage;

public class DWS_Tricentis extends Base_Test{

	public DWS_Tricentis() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void tricentis()
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.click_tricentis();
	}
	

}
