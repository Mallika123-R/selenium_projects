package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Test_listener implements ITestListener {
	
	
	public void onTestFailure(ITestResult res) {
		System.out.println("this test is failed"+res.getName());
		System.out.println(res.getStatus());
		System.out.println(res.getThrowable().getMessage());
		ExtentTest test=(ExtentTest)res.getTestContext().getAttribute("test");
		
		test.log(Status.FAIL,res.getThrowable().getMessage());
	}
	
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSuccess(ITestResult res) {
		System.out.println("This test is passed");
ExtentTest test=(ExtentTest)res.getTestContext().getAttribute("test");
		
		test.log(Status.PASS,res.getName()+"Test passed");

		
	}
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult res) {
		System.out.println("This test is skipped");
ExtentTest test=(ExtentTest)res.getTestContext().getAttribute("test");
		
		test.log(Status.FAIL,res.getName()+"Test passed");
		
	}

}
