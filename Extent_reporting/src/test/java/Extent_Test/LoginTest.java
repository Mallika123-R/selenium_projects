package Extent_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;

import Extent_Manage.Extent_Manager;

public class LoginTest {
	
	ExtentTest test;
	ExtentReports reports;
	
	@BeforeMethod
	public void init() {
		
		reports=Extent_Manager.getReports();
		
		 test=reports.createTest("LoginTest");
		/*reports=new ExtentReports();
		
		ExtentSparkReporter sparks=new ExtentSparkReporter(System.getProperty("user.dir")+"//reports//"); 
	     sparks.config().setReportName("This is my first Project");
	     sparks.config().setDocumentTitle("Journey of my life");
	     sparks.config().setTheme(Theme.DARK);
	     sparks.config().setEncoding("utf-8");
	     
	     reports.attachReporter(sparks);*/
	     
	     
	}
	
	@AfterMethod
	public void quit() {
		  reports.flush();
	}
	@Test
	public void login() throws IOException{
	
	     test.log(Status.INFO,"Starting test case");
	     test.log(Status.INFO, "Opening browser");
	     //test.log(Status.FAIL, "404 Error");
	    // Assert.fail("404 Error");
	     String path=System.getProperty("user.dir")+"//reports"+"//screenshots//test.png";
	     test.addScreenCaptureFromPath(path,"404 Error");
	     test.log(Status.INFO, "logging INN");
	     test.log(Status.PASS, "Test Passed");	
	     
	   
	     
	
	}

}
