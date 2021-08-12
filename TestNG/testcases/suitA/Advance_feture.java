package suitA;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Advance_feture {
	@BeforeClass
	public void check()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void check2()
	{
		System.out.println("after class");
	}
	@BeforeTest
	public void init()
	{   
		 System.out.println("---before Test----");
		//System.out.println("Open Browser");
	}
	
	@Test
	public void login()
	{
		
		System.out.println("Loggin1");
	}
	
	@AfterTest
	public void after(){
		System.out.println("---After Test--");
		//System.out.println("close browser");
	}
	@Test
	public void loggout()
	{
		
		System.out.println("loggin2");
	}
	
	@BeforeMethod
	public void method()
	{
	System.out.println("***Before Method****");	
	}
	
	@Test
	public void again()
	{
		System.out.println("login3");
	}
	@AfterMethod
	public void afterr()
	{
		System.out.println("****After Method***");
	}
	@Test
	public void again1()
	{
		System.out.println("login4");
	}
	
	

}
