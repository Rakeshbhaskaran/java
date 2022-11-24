package TESTNG_BASICS;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WW_TESTDATA_ITERATIONS {

	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object[][] data = new Object[4][2];
		data[0][0]="pradyumna";
		data[0][1]="r";
		data[1][0]="rakesh";
		data[1][1]="b";
		data[2][0]="magendra";
		data[2][1]="m";
		data[3][0]="chi";
		data[3][1]="chi";
		
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void demo(String firstname,String lastname)
	{
		System.out.print(firstname+" ");
		System.out.println(lastname);
	}
	

}
