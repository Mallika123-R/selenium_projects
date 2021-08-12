package com.Interview_Practice;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import extent_Manager.extent_manage;

public class Window_mngmt {
	
	
	     ExtentReports reports;
		 WebDriver driver;
		 ExtentTest test;
		 
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
		public void handle() throws IOException
		{
			System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\driver\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("http://demo.guru99.com/popup.php");
			test.log(Status.INFO, "Browser Open successful");
			screenshot(driver);
			
			driver.findElement(By.partialLinkText("Click")).click();
			
			
			String MainWindow=driver.getWindowHandle();
			
			Set<String> s1=driver.getWindowHandles();
			Iterator<String> I1=s1.iterator();
			
			while(I1.hasNext())
			{
				String childWindow=I1.next();
				if(!MainWindow.equalsIgnoreCase(childWindow))
				{
					driver.switchTo().window(childWindow);
					driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("abc@gmail.com");
					screenshot(driver);
					driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
					test.log(Status.INFO, "Submit successful");
				
					
					driver.close();
					
				}
				
			}
			driver.switchTo().window(MainWindow);
					
		}
		@Test
		public void screenshot(WebDriver driver) throws IOException
		{
			Date d=new Date();
			String store_file=d.toString().replaceAll(":", "_")+".png";
			File screenshot_file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot_file, new File(extent_manage.Screenshot+"//"+store_file));
			test.log(Status.INFO,"Test---->"+test.addScreenCaptureFromPath(extent_manage.Screenshot+"//"+store_file));
		}

		
	}


