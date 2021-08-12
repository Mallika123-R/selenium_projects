package Extent_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Extent_Manage.Extent_Manager;

public class RegTest {

	ExtentTest test;
	ExtentReports reports;
	
	@BeforeMethod
	public void init() {
		
		reports=Extent_Manager.getReports();
		test=reports.createTest("Registeration");
	}
	
	@AfterMethod
	public void quit() {
		  reports.flush();
	}
	@Test
	public void login(){
		 
	     test.log(Status.INFO,"Starting Registration case");
	     test.log(Status.INFO, "Opening Crome browser");
	     //test.log(Status.FAIL, "404 Error");
	    // Assert.fail("404 Error");
	     test.log(Status.INFO, "Logging");
	     test.log(Status.FAIL, "Test Failed");	
	     
	   
	     
	
	}
}
