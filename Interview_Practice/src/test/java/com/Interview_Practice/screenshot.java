package com.Interview_Practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import extent_Manager.extent_manage;

public class screenshot {
	WebDriver driver;
	ExtentTest test;
	ExtentReports reports;
	
	@BeforeMethod
	 public void init(ITestResult res)
	 {
		reports=extent_manage.getTest(); 
		test=reports.createTest(res.getMethod().getMethodName().toUpperCase());
		
	 }
	 @AfterMethod
	 public void quit()
	 {
		 reports.flush();
	 }
	@Test
	public void login() throws IOException
	{
		System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		test.log(Status.INFO, "Browser Open successful");
		screenshot(driver);
		
	
	}
	 public void screenshot(WebDriver driver) throws IOException
	 {
		Date d=new Date();
		String store_file=d.toString().replaceAll(":", "_")+".png";
		File screenshot_file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_file, new File(extent_manage.Screenshot+"//"+store_file));
		test.log(Status.INFO,"Test---->"+test.addScreenCaptureFromPath(extent_manage.Screenshot+"//"+store_file));
	 }
	 

}
