package suiteA;

import org.testng.annotations.Test;

import TestNG_parallel.BaseTest;

public class TestA extends BaseTest{

	@Test
	public void TestA() throws InterruptedException
	{
		System.out.println("Starting TestA");
		openbrowser("IE");
		//driver.get("http://google.com");
		Thread.sleep(5000);
		System.out.println("Ending Test A");
	}
}
