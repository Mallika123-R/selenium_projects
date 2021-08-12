package suiteB;

import org.testng.annotations.Test;

import TestNG_parallel.BaseTest;

public class TestB extends BaseTest{

	@Test
	public void TestA() throws InterruptedException
	{
		System.out.println("Starting TestB");
		openbrowser("edge");
		//driver.get("http://google.com");
		Thread.sleep(5000);
		System.out.println("Ending Test B");
	}
}
