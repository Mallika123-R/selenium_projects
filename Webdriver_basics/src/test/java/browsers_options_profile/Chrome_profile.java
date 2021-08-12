package browsers_options_profile;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Chrome_profile {

	@Test
	public void chrome()
	{
		System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\msedgedriver.exe");
		 
		//log
		System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY,"logs//edge.log");
		EdgeOptions ed=new EdgeOptions();
		ed.addArguments("disable-notifications");
		ed.addArguments("Start-maximized");
		ed.addArguments("ignore-certificate-error");
		
		EdgeDriver eds=new EdgeDriver(ed);
		eds.get("http://yahoo.com");
	}
}
