package testcases;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class skip_ITestContext {
	
	boolean flag=false;//if true then skip the method
	@Test
	public void search(ITestContext cont)
	{
		if(flag)
		{
			throw new SkipException("search");
		}
		System.out.println("search Phone");
		cont.setAttribute("Phone_Name", "One_plus");
		//cont.setAttribute("Phone_Name","One_Plus");
	}
	@Test(dependsOnMethods= {"search"})
	public void select_phone(ITestContext cont)
	{
		System.out.println("select Phone");
		
		String Name=(String)cont.getAttribute("Phone_Name");
		System.out.println("Select_Phone :" +Name);
	}

}
