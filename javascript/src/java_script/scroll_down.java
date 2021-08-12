package java_script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class scroll_down{
    
	@Test
	public void golf() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\driver\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		((WebDriver) driver).get("http://demo.guru99.com/test/guru99home");
		//js.executeScript("window.scrollTo(0,"+(y-30)+")");
		js.executeScript("window.scrollBy(0,1000)");
		
		
		
	}
}
