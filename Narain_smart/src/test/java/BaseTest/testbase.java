package BaseTest;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testbase  {
	Properties prop;
	public WebDriver driver;
	
	@Test
	public void webdriver()
	{
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		//prop=new Properties();
		driver.get("https://www.americangolf.co.uk");
		WebElement e=driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[2]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(e).build().perform();
		
		boolean first=driver.findElement(By.xpath("//span[text()='Wedges']")).isEnabled();
		System.out.println(first);
		  
		  
	}
	

	}
