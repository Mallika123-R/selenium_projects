

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Testbase {
	
	WebDriver driver;
	
	public WebDriver launchdriver(String browserName)
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
		}
		return driver;
	}
}
