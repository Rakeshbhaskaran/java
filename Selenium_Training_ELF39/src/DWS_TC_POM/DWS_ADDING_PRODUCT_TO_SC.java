package DWS_TC_POM;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import FRAMEWORKUTILITY.Utility_Methods;
import POM_DWS.DWS_BooksPage;
import POM_DWS.DWS_HomePage;

public class DWS_ADDING_PRODUCT_TO_SC extends Base_Test{

	public DWS_ADDING_PRODUCT_TO_SC() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Test
	public void addToCart() throws InterruptedException
	{
		DWS_HomePage hp = new DWS_HomePage(d);
		hp.click_book_link();
		
		DWS_BooksPage bp = new DWS_BooksPage(d);
		bp.addToCart_comp_internet_book();
		Thread.sleep(2000);
		
	}

}
