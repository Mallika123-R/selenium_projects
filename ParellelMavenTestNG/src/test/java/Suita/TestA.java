package Suita;

import org.testng.annotations.Test;

public class TestA {

	@Test
	public void testA() throws InterruptedException{
	System.out.println("Starting Test Suite A");
	Thread.sleep(3000);
	System.out.println("Starting Test Suite B");
	}
}
