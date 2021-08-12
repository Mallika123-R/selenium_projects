package suiteA;

import org.testng.annotations.Test;

import TestNG_parallel.BaseTest;

public class TestA3 extends BaseTest{
	@Test
	public void TestA3() throws InterruptedException
	{
		System.out.println("Starting TestA3");
		openbrowser("Mozilla");
		//driver.get("http://google.com");
		Thread.sleep(5000);
		System.out.println("Ending Test A3");
	}
}
