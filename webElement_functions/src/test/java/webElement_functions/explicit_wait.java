package webElement_functions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicit_wait {
  public WebDriver driver;
	@Test
	public void explicit()
	{
		System.setProperty("webdriver.edge.driver","D:\\\\SeleniumPractice\\\\Drivers\\\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.awwwards.com");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/strong/a")).click();
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
       wait.until(ExpectedConditions.presenceOfElementLocated(By.name("_username")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("_username")));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("_username")));*/
		if(isElementPresent("//input[@name='_username']"))
		{
			driver.findElement(By.name("_username")).sendKeys("hello");
		}
		
	}
	@Test
	/*public boolean isElementPresent(String elementxpath)
	{
		int s= driver.findElements(By.xpath(elementxpath)).size();
		if(s==0)
			return false;
		
		if(driver.findElement(By.xpath(elementxpath)).isDisplayed() && driver.findElement(By.xpath(elementxpath)).isEnabled())
		return true;
		
		//System.out.println("not found");
		return false;
		
	}*/
	public boolean isElementPresent(String elementxpath)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		try{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementxpath)));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementxpath)));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
