package Testcases_NG;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class begining {
	
	boolean flag=false;//for skip the code
	@Test(priority=1)
	public void search(ITestContext cont)
	{
		if(flag)
		{
			throw new SkipException("search");
		}
		System.out.println("search phone");
		cont.setAttribute("Phone_Name","One_Plus");
	}
	@Test(priority=2,dependsOnMethods= {"search"})
	public void phone(ITestContext cont)
	{
		//System.out.println("select_phone");
		//Assert.fail(); //stop the next code so we use softAssert
		String Name=(String)cont.getAttribute("Phone_Name");
		System.out.println("Select Phone :" +Name);
	}
	
	@Test(priority=3,dependsOnMethods={"phone"})
	public void dologin()
	{
		SoftAssert softy=new SoftAssert();
		softy.assertEquals("ABC", "ABC");
		softy.assertEquals("ABC", "XYZ");
		softy.assertTrue(11>67,"error");
		
		softy.assertAll();
		
		String expectedResult=("ABC");
		String actualResult=("ABC");
		
		Assert.assertEquals(actualResult, expectedResult);
		Assert.assertTrue(5>2,"msg");
	}
		
	

	
   
}

