package suitec;

import org.testng.annotations.Test;

import testbase.main_testbase;

public class TestCC extends main_testbase{

	@Test(groups= {"smoke","sanity","browsergroup2"})
	public void testCC() throws InterruptedException
	{
		System.out.println("Starting test CC");
		log("I am starting Test CC");
		Thread.sleep(2000);
		System.out.println("Ending test CC");
	}

}
