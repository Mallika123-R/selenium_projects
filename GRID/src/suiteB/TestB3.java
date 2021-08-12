package suiteB;

import org.testng.annotations.Test;

import TestNG_parallel.BaseTest;

public class TestB3 extends BaseTest{
	@Test
	public void TestA3() throws InterruptedException
	{
		System.out.println("Starting TestB3");
		openbrowser("IE");
		//driver.get("http://google.com");
		Thread.sleep(5000);
		System.out.println("Ending Test B3");
	}
}
