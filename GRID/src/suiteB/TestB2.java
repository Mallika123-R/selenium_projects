package suiteB;

import org.testng.annotations.Test;

import TestNG_parallel.BaseTest;

public class TestB2 extends BaseTest {
	@Test
	public void TestA2() throws InterruptedException
	{
		System.out.println("Starting TestB2");
		openbrowser("Mozilla");
		//driver.get("http://google.com");
		Thread.sleep(5000);
		System.out.println("Ending Test B2");
	}
}
