package testbase;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Extent_Manage.Extent_Manager;

public class main_testbase {
	
	public ExtentReports rep;
	public ExtentTest test;
	public SoftAssert softy;
	public String brows;
	
	@BeforeMethod(alwaysRun=true)
	
	public void init(ITestContext con, ITestResult res)
	{
		
		rep=Extent_Manager.getReports();
		test=rep.createTest(res.getMethod().getMethodName().toUpperCase());
		res.setAttribute("reporter", test);
		softy=new SoftAssert();
		
		
		String groupname[]=con.getAllTestMethods()[0].getGroups();
		//System.out.println(groupname);
		String browserGroup="";
		for(String g:groupname)
		{
			if(g.startsWith("browsergroup"))
					{
				  browserGroup=g;
				  break;
					}
			
			
			
		}
		brows=con.getCurrentXmlTest().getParameter(browserGroup);
		System.out.println("browsergroup name is" +brows);
		
		
			/*if(g.startsWith("browsergroup"))
			{
				browsergroup=g;
				break;
			}
			
		}
		System.out.println("Browser name is " +browsergroup1);
		//brows = con.getCurrentXmlTest().getParameter("browser");*/
		
		
		
	}

	
	@AfterMethod(alwaysRun=true)
	public void quit()
	{
		rep.flush();
	}
	
	public void log(String msg)
	{
		System.out.println(msg);
		test.log(Status.INFO,msg);
	}
	public void logFailure(String msg)
	{
		System.out.println(msg);
		test.log(Status.FAIL,msg);
	}
	public void FailAndStopTest(String msg)
	{
		System.out.println(msg);
		test.log(Status.FAIL,msg);
	}
	public void SoftAssert(String msg)
	{
		logFailure(msg);
		softy.fail(msg);
		test.log(Status.INFO,msg);
		
	}
	
}
