package DWS_TC_POM;

import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import POM_DWS.DWS_HomePage;

public class DWS_DigitalDownloads extends Base_Test{

	public DWS_DigitalDownloads() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Test
	public void digital_download()
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.click_digitalDownloads();
	}

}
