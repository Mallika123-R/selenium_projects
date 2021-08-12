package zoho.context;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import zoho.report.Extent_Manager;

public class TestContext {
	ExtentReports report;
	ExtentTest test;
	
	private PageObjectManager pageobjectManager;
	public TestContext() throws IOException
	{
		System.out.println("Constructor of context");
	    report=Extent_Manager.getReports(); //initialize report
	    pageobjectManager=new PageObjectManager();
		
	}
	public PageObjectManager getpageObjectManager()
	{
		return pageobjectManager;
	}
	public void createScenario(String scenarioName)
	{
		test=report.createTest(scenarioName);
		this.pageobjectManager.getWebDriverManager().init(test);
	}
	public void endScenario()
	{
		report.flush();
	}
	public void log(String msg)
	{
		this.pageobjectManager.getWebDriverManager().log(msg);
	}

}
