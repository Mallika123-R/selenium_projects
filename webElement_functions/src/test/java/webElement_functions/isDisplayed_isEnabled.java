package webElement_functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class isDisplayed_isEnabled extends Testbase {

	/*@Test
	public void displayed()
	{
		//isdisabled function
		WebDriver driver=launchdriver("Edge"); 
		   driver.get("https://www.cnn.com");
		  driver.findElement(By.cssSelector("svg.menu-icon")).click();
		 
		 boolean b=driver.findElement(By.xpath("//*[@id='header-nav-container']/div/div[2]/div/div[3]/nav/ul/li[3]/ul/li[1]/a")).isDisplayed();
		 System.out.println("visibility check: " +b);
		 driver.findElement(By.xpath("//*[@id='header-nav-container']/div/div[2]/div/div[3]/nav/ul/li[3]/ul/li[1]/a")).click(); 
		 
	}*/
	@Test
	public void enabled() throws InterruptedException
	{
		//isenabled function eg-checkbox
		WebDriver driver=launchdriver("Edge"); 
		   driver.get("https://www.zoho.com");
		 
		   driver.findElement(By.cssSelector(".zh-signup")).click();
		   int i=1;
		   while(i<=10)
		   {
			   if(driver.findElement(By.cssSelector(".za-tos")).isEnabled())
				   break;
			   else {
				   Thread.sleep(1000);
				   i++;
			   }
		   }
		   driver.findElement(By.cssSelector(".za-tos")).click();
		   
	}
	
}
