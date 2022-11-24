package DWS_TC_POM;

import org.testng.annotations.Test;

import FRAMEWORKUTILITY.Base_Test;
import POM_DWS.DWS_HomePage;

public class DWS_AddProductFrom_NoteBookPage extends Base_Test{

	public DWS_AddProductFrom_NoteBookPage() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void addProFromNotebook()
	{
		DWS_HomePage hp= new DWS_HomePage(d);
		hp.moveToComputer_tab(d);
		hp.click_noteBook_button();
	}
	
	

}
