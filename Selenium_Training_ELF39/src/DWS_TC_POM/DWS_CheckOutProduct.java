package DWS_TC_POM;

import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import POM_DWS.DWS_HomePage;
import POM_DWS.DWS_ShoopinCartPage;

public class DWS_CheckOutProduct extends Base_Test {

	public DWS_CheckOutProduct() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Test
	public void checkOutProduct()
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.click_shoppingCart_buuton();
		
		DWS_ShoopinCartPage scp = new DWS_ShoopinCartPage(d);
		scp.select_Product_CheckBox();
		scp.select_Terms_CheckBox();
		scp.select_checkOut_Button();
	}

}
