package TESTNG_BASICS;

import org.testng.annotations.Test;

public class WW_DEPENDENTONMETHOD {

	@Test
	public void Register()
	{
		System.out.println("Excecuting Register");
	}
	
	@Test ( dependsOnMethods = "Register" )
	public void Login ()
	{
		System.out.println("Excecuting Login");
	}
	
	@Test ( dependsOnMethods ="Login" )
	public void Search()
	{
		System.out.println("Excecuting Search");
	}
	@Test ( dependsOnMethods = "Search" )
	public void Logout()
	{
		System.out.println("Excecuting Logout");
	}
	
}

