package DWS_TC_POM;

import java.util.Set;

import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import POM_DWS.DWS_HomePage;
import POM_DWS.DWS_TwiiterPage;

public class DWS_TwiterLogin extends Base_Test {

	public DWS_TwiterLogin() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void twitterLogin() throws InterruptedException
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.click_twitterlink();
		Set<String> webdrivers=d.getWindowHandles();
		for(String o:webdrivers)
		{
			String title=d.switchTo().window(o).getTitle();
			System.out.println(title);
		}
		
		
		
		
		DWS_TwiiterPage tp = new DWS_TwiiterPage(d);
		tp.click_login();
		
		Thread.sleep(12000);
		
	}
	

}
