package com.Interview_Practice;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import extent_Manager.extent_manage;

public class Extent_Report {
	
	public ExtentTest test;
	public ExtentReports reports;
	
	@BeforeMethod
	public void init(ITestResult res)
	{
		reports=extent_manage.getTest();
		test=reports.createTest(res.getMethod().getMethodName().toUpperCase());
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void quit()
	{
		reports.flush();
		System.out.println("After Method");
	}
	@Test
	public void login() throws IOException
	{
		test.log(Status.INFO,"Browser is open successfull");
		test.log(Status.INFO, "Login successfull");
		test.log(Status.FAIL,"Rgistration is not successfully added");
		String path=System.getProperty("user.dir")+"//reports//"+"//screenshot//test.png";
		test.addScreenCaptureFromPath(path);
		test.log(Status.INFO, "Add screenshot Successful");
		test.log(Status.PASS, "Test passed");
	}

}
