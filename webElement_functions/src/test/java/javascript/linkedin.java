package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import webElement_functions.Testbase;

public class linkedin extends Testbase {
   
	public WebDriver driver;
	@Test
	public void linked()
	{
		driver=launchdriver("Edge");
		driver.get("https://www.linkedin.com/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('username').value='Hello'");
		js.executeScript("window.scrollTo(0,100)");
	}
}
