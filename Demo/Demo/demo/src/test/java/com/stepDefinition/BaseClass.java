package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BaseClass {
	
	
public static WebDriver driver;
public static WebDriver launchBrowser(String browsername)
{
	if(browsername.equals("Mozilla"))
	{   
		System.out.println("browser is opening" +browsername);
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
		FirefoxOptions ops=new FirefoxOptions();
		 FirefoxProfile fb=new FirefoxProfile();
		FirefoxDriver fd=new FirefoxDriver(ops);
		
		fb.setPreference("dom.webnotificitions.enabled", false);
		
		fb.setAcceptUntrustedCertificates(true);
		fb.setAssumeUntrustedCertificateIssuer(false);
		ops.setProfile(fb);
		driver=new FirefoxDriver(ops);
	}
	
	else if(browsername.equals("Edge"))
	{
		System.out.println("browser is opening" +browsername);
		System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\msedgedriver.exe");
	
		driver=new EdgeDriver();	
		
		
     }
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;	

}



	
}

