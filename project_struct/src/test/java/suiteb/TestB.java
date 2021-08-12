package suiteb;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DataProvider.Test_DataProvider;
import testbase.main_testbase;

public class TestB extends main_testbase {
	//@Parameters("browser")
	@Test(groups= {"smoke","browsergroup1"},dataProviderClass=Test_DataProvider.class,dataProvider="dataSuitB")
	public void testB(String browserName,String uname, String pass) throws InterruptedException
	{
		System.out.println("Starting test B");
		log("I am starting Test B"+brows);
		log(uname+"----"+pass);
		Thread.sleep(2000);
		System.out.println("Ending test B");
	}

}
