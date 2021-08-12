package TestNG_parallel;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

	  public WebDriver driver;
	@Test
	public void openbrowser(String browser)
	{
		DesiredCapabilities cap=null;
		if(browser.equals("Mozilla"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(browser.equals("Chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(browser.equals("edge"))
		{
			cap=DesiredCapabilities.edge();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(browser.equals("IE"))
		{
			cap=DesiredCapabilities.internetExplorer();
			cap.setPlatform(Platform.WINDOWS);
		}
		try {driver=new RemoteWebDriver(new URL("http://Localhost:8090/wd/hub"),cap);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}
	@AfterMethod
	public void quit()
	{
		if(driver!=null)
		{
			driver.quit();
			
		}
	}

}
