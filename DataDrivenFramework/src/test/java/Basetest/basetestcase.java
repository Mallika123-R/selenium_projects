package Basetest;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

//import Extent_Manage.Extent_Manager;
import Extent_manager.extent_report;
import Keywords.Application_key;
import Keywords.validation_key;

public class basetestcase {

	public Application_key app;
	public validation_key valid;
	public ExtentReports rep;
	public ExtentTest test;
	
	@BeforeTest(alwaysRun=true)
	public void beforeTest(ITestContext con) throws IOException, InterruptedException
	{
		System.out.println("-----Before Test-------");
		app=new Application_key();
		valid=new validation_key();
		con.setAttribute("app", app);
		//init the reporting of the test
	    rep=extent_report.getReports();
	    test=rep.createTest(con.getCurrentXmlTest().getName());
	    test.log(Status.INFO,"Starting test"+con.getCurrentXmlTest().getName());
	    app.setReport(test);
	    //app= new Application_key(test);
	    app.OpenBrowser("Edge");
	   
	   // app.defaultLogin();
	    con.setAttribute("report", rep);
	    con.setAttribute("test", test);
	}
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(ITestContext con) throws IOException
	{
		System.out.println("-----Before Method-------");
		String critical_failure=(String)con.getAttribute("critical_Fail");
	      if(critical_failure!=null && critical_failure.equals("Y"))
	      {
	    	  test.log(Status.FAIL, "critical failure in previous test");
	    	  throw new SkipException("critical failure in previous test");
	    	  
	      }
	      app=(Application_key) con.getAttribute("app");
	      rep=(ExtentReports)con.getAttribute("report");
	      test=(ExtentTest)con.getAttribute("test");
	      
	}
	@AfterTest
	public void quit()
	{
		if(rep!=null)
		{
			rep.flush();
		}
	}
	
}

