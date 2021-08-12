package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class firstListener implements ITestListener{
	public void OnTestFailure(ITestResult result)
	{
		System.out.println("Testing failed");
		System.out.println(result.getName());
		System.out.println(result.getTestContext().getAttribute("name"));
		System.out.println(result.getStatus());
		System.out.println(result.getThrowable().getMessage());
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


	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
