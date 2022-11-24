package TESTNG_PRACTISE;

import org.testng.annotations.Test;

  class A2 {
	  
	
	@Test(priority = 33)
	public void search()
	{
		System.out.println("Executing search");
	}
	@Test(priority = 44)
	public void advancedsearch()
	{
		System.out.println("Executing advanced search");
	}
	@Test(priority = 55)
	public void wishlist()
	{
		System.out.println("Executing wishlist");
	}

}
