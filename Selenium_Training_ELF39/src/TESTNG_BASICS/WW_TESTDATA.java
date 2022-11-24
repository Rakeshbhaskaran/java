package TESTNG_BASICS;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WW_TESTDATA {

	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object[][] data = new Object[1][2];
		data[0][0]="rakesh";
		data[0][1]="B";
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void demo(String firstname,String lastname)
	{
		System.out.println(firstname);
		System.out.println(lastname);
	}

}
