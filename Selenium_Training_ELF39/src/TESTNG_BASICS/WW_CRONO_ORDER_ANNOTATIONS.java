package TESTNG_BASICS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class WW_CRONO_ORDER_ANNOTATIONS {

	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}
	@Test
	public void Marvel()
	{
		System.out.println("IRONMAN");
	}
	@Test
	public void DC()
	{
		System.out.println("BATMAN");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After test");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After class");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	

}
