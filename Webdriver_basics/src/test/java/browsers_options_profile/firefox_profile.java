package browsers_options_profile;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

public class firefox_profile {

	@Test
	public void firefox() {
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
		//log
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"logs\\firefox.log");
		FirefoxOptions ops=new FirefoxOptions();
		FirefoxDriver fd=new FirefoxDriver(ops);
		
		ProfilesIni allprofile=new ProfilesIni();
		FirefoxProfile prof=allprofile.getProfile("Feb2021");
		
		//disable notification
		prof.setPreference("dom.webnotificitions.enabled", false);
		fd.get("http://pushengage.com/demo");
		
		//SSL error
		prof.setAcceptUntrustedCertificates(true);
		prof.setAssumeUntrustedCertificateIssuer(false);
		ops.setProfile(prof);
		
		
		
		
		
		
		
	}
}
