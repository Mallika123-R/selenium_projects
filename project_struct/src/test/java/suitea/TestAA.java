package suitea;

import org.testng.annotations.Test;

import DataProvider.Test_DataProvider;
import testbase.main_testbase;

public class TestAA extends main_testbase{
	@Test(groups= {"smoke","sanity","browsergroup2"},dataProviderClass=Test_DataProvider.class,dataProvider="dataSuitA")
	public void testAA(String browserName,String userName, String Password) throws InterruptedException
	{
		System.out.println("Starting test AA");
		log("I am starting Test AA");
		log(userName+"----"+Password);
		Thread.sleep(2000);
		System.out.println("Ending test AA");
	}

}
