package TESTNG_BASICS;

import org.testng.annotations.Test;

public class WW_PRIORITY {
	
	@Test(priority=1)
	public void Register()
	{
		System.out.println("Executing Register");
	}

	@Test (priority =2)
	public void Login()
	{
		System.out.println("Executing Login");
	}
	@Test(priority =3)
	public void Search()
	{
		System.out.println("Executing Search");
	}
	@Test(priority=4)
	public void Logout()
	{
		System.out.println("Executing logout");
	}
}
