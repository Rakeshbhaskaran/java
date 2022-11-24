package TESTNG_BASICS;

import org.testng.annotations.Test;

public class MI {

	@Test (groups="smoketest")
	public void Register()
	{
		System.out.println("Excecuting Register");
	}
	
	@Test (groups="smoketest")
	public void Login ()
	{
		System.out.println("Excecuting Login");
	}
	
	
	@Test 
	public void Logout()
	{
		System.out.println("Excecuting Logout");
	}
	

}
