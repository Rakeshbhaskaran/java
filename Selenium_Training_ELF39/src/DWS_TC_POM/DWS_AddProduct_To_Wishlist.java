package DWS_TC_POM;

import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import POM_DWS.DWS_HomePage;

public class DWS_AddProduct_To_Wishlist extends Base_Test {

	public DWS_AddProduct_To_Wishlist() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void add_Product_To_Wishlist()
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.click_Wishlist_link();
		
		
		
	}
	
	

}
