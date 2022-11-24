package DWS_TC_POM;

import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import POM_DWS.DWS_AdvanceSearchPage;
import POM_DWS.DWS_HomePage;

public class DWS_AdavnceSearch extends Base_Test{

	public DWS_AdavnceSearch() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Test
	public void advance_Search()
	{
		
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.sendKeys_to_search_feild("books");
		hp.click_search_button();
		
		DWS_AdvanceSearchPage asp = new DWS_AdvanceSearchPage(d);
		asp.click_adv_srch_checkbox();
		asp.select_from_cate_dropdown("Books");
		asp.click_auto_srch_checkbox();
		asp.select_from_mfd_dropdown("All");
		asp.send_start_value("0");
		asp.send_end_value("5000");
		asp.click_product_search_checkbox();
		asp.click_search_button1();
		
	}

}
