package suitb;

import org.testng.annotations.Test;

public class TestB {

	@Test
	public void testB() throws InterruptedException{
	System.out.println("Starting Test Suiteb A");
	Thread.sleep(3000);
	System.out.println("Starting Test Suiteb B");
	}
}
