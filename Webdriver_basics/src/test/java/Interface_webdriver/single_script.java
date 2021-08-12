package Interface_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class single_script {
	
	@Test
	public void script()
	{
		System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver","D:\\SeleniumPractice\\Drivers\\IEdriverServer.exe");
		
		String browser="Edge";
		WebDriver driver=null;
		
		if(browser.equals("Mozilla"))
		  driver=new FirefoxDriver();
		
		else if(browser.equals("Chrome"))
			  driver=new ChromeDriver();
			
		else if(browser.equals("Edge"))
			  driver=new EdgeDriver();
		
		else if(browser.equals("InternetExplorer"))
			  driver=new InternetExplorerDriver();
		
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
		
	}

}
