package pilot_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Extent_manager.extent_report;

public class Testbase {
	
	public WebDriver driver;
	public Properties prop=null;
	public ExtentReports rep;
	public ExtentTest test;
	public SoftAssert softy;
	
	@BeforeMethod
	public void init(ITestResult result)
	{
		rep=extent_report.getReports();
		test=rep.createTest(result.getMethod().getMethodName().toUpperCase());
		result.setAttribute("reporter","test");
		softy=new SoftAssert();
	}
	
	@AfterMethod
	public void quit()
	{
		rep.flush();
	}
	public void failAndStopTest(String msg) {//fail in testng as well as extent - but stop
		softy.fail(msg);
		softy.assertAll();//stop
	}
	public void logFailure(String msg)
	{
		System.out.println(msg);
		test.log(Status.FAIL, msg);
	}
	public void SoftAssert(String msg)///fail in testg as well as extent - but continue
	{
		logFailure(msg);
		softy.fail(msg);
		
	}
	
	public void log(String msg)
	{
		System.out.println(msg);
		test.log(Status.INFO, msg);
	}
	
	public WebDriver launchdriver(String browserName) throws IOException
	{
		if(browserName.equals("Mozilla"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
			//log
			//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"logs\\firefox.log");
			FirefoxOptions ops=new FirefoxOptions();
			 FirefoxProfile fb=new FirefoxProfile();
			FirefoxDriver fd=new FirefoxDriver(ops);
			
			//ProfilesIni allprofile=new ProfilesIni();
			//FirefoxProfile prof=allprofile.getProfile("Feb2021");
			
			//disable notification
			fb.setPreference("dom.webnotificitions.enabled", false);
			//fd.get("http://pushengage.com/demo");
			
			//SSL error
			fb.setAcceptUntrustedCertificates(true);
			fb.setAssumeUntrustedCertificateIssuer(false);
			ops.setProfile(fb);
			driver=new FirefoxDriver(ops);
		}
		
		else if(browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\msedgedriver.exe");
			 
			//log
			//System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY,"logs//edge.log");
			EdgeOptions ed=new EdgeOptions();
			ed.addArguments("disable-notifications");
			ed.addArguments("Start-maximized");
			ed.addArguments("ignore-certificate-error");
			
			driver=new EdgeDriver(ed);	
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			prop=new Properties();
			try {
				FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//project.properties");
				prop.load(fs);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
		return driver;
	}
	
}
