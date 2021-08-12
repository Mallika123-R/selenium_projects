package suitec;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import testbase.main_testbase;

public class TestC extends main_testbase{
	
	@Test(groups= {"smoke","browsergroup2"})
	//@Parameters("browser")
	
	public void testC(ITestContext con) throws InterruptedException
	{
		System.out.println("Starting test C");
		log("I am starting Test C"+brows);
		
		Thread.sleep(2000);
		System.out.println("Ending test C");
	}

}
