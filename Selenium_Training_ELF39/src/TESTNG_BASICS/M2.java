package TESTNG_BASICS;

import org.testng.annotations.Test;

public class M2 {

	@Test (groups="smoketest")
	public void Search()
	{
		System.out.println("Excecuting Search");
	}
	@Test 
	public void AdvancedSearch()
	{
		System.out.println("Excecuting AdvancedSearch");
	}
	@Test 
	public void wishlist()
	{
		System.out.println("Excecuting wishlist");
	}
}
