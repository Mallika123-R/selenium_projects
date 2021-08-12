package javascript;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import webElement_functions.Testbase;

public class random_click extends Testbase{
	WebDriver driver;
	@Test
	public void random() throws InterruptedException
	{
		driver=launchdriver("Edge");
		driver.get("https://www.americangolf.co.uk");
		WebElement golf=driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[2]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(golf).build().perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a")));
		//driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a")).click();
		List<WebElement> links=driver.findElements(By.xpath("//div[@id='CLUBS_1']/descendant::a"));
		Random r=new Random();
		int i=r.nextInt(links.size());
		links.get(i).click();
		
		waitforPageLoad();
		//Thread.sleep(5000);
		WebElement e=driver.findElements(By.xpath("//div[@class='noUi-base']")).get(1);
		//scroll down
		int y=e.getLocation().y;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+(y-30)+")");
		
		act.clickAndHold(e).moveByOffset(100, 0).release().build().perform();
		
	}
	public void waitforPageLoad() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		int i=0;
		while(i!=10)
		{
			String state=(String)js.executeScript("return document.readystate;");
			System.out.println(state);
			if(state.equals("complete"))
				break;
			
			else
				Thread.sleep(2000);
			i++;
			
		}
		  i=0;
		  while(i!=10)
		  {
			  Long d=(Long)js.executeScript("return jQuery.active;");
			  System.out.println(d);
			  if(d.longValue()==0)
				  break;
			  
			  else
				  Thread.sleep(2000);
			    i++;
			  
		  }
		
	}

}
