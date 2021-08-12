package suitea;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DataProvider.Test_DataProvider;
import testbase.main_testbase;

public class TestA extends main_testbase {
	@Parameters("browser")
	@Test(groups= {"smoke","browsergroup1"},dataProviderClass=Test_DataProvider.class,dataProvider="dataSuitA")
	public void testA(String browserName, String Name, String pass) throws InterruptedException
	{
		System.out.println("Starting test A");
		log("I am starting Test A"+brows);
		
		if(!"Title".equals("Titles"))
		{
			SoftAssert("do not match");
		}
		log("Logging into App");
		log("booking confirmed");
		//softy.assertEquals("Title", "Titles");
		if("Test".equals("Tests"))
		{
			SoftAssert("this test is not  match");
		}
			//softy.assertEquals("Test", "Tests");
		log(Name+"-----"+pass);
		Thread.sleep(2000);
		softy.assertAll();
		//Assert.fail("404 error");
	}

	
	
}
