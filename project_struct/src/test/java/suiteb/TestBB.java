package suiteb;

import org.testng.annotations.Test;

import DataProvider.Test_DataProvider;
import testbase.main_testbase;

public class TestBB extends main_testbase {
	@Test(groups= {"smoke","sanity","browsergroup2"})
	public void testBB() throws InterruptedException
	{
		System.out.println("Starting test BB");
		log("I am starting Test BB");
		//log(user_name+"----"+pass_word);
		Thread.sleep(2000);
		System.out.println("Ending test BB");
	}

}
