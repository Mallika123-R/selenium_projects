package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert_Methods {

	@Test
	public void LoginTest()
	{
		String expectedResult="ABC";
		String actualResult="ABC";
		Assert.assertEquals(expectedResult,actualResult);
		Assert.assertTrue(5<2,"error msg");
		
		
	}
	@Test
	public void soft_assert()
	{
		SoftAssert softy=new SoftAssert();
		softy.assertEquals("ABC", "ABC");
		softy.assertEquals("ABC","XYZ");
		softy.assertTrue(5<11,"error");
		
		softy.assertAll();
	}

}
