package testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Fail");
		System.out.println(result.getName());
		System.out.println(result.getTestContext().getAttribute("name"));
		System.out.println(result.getStatus());
		System.out.println(result.getThrowable().getMessage());
		
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Passed"+result.getName());
	
	
		
	}
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
