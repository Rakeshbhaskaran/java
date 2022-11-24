package TESTNG_PRACTISE;

import org.testng.annotations.Test;

public class A1 {

	@Test(priority = 2)
	public void login()
	{
		System.out.println("Executing login");
	}
	@Test(priority = 1)
	public void register()
	{
		System.out.println("Executing Register");
	}
	@Test(priority = 6)
	public void logout()
	{
		System.out.println("Executing logout");
	}
}
