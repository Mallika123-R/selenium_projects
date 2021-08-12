package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import webElement_functions.Testbase;

public class american_golf2 extends Testbase{

	@Test
	public void golf() throws InterruptedException
	{
		WebDriver driver=launchdriver("Edge");
		driver.get("https://www.americangolf.co.uk");
		WebElement golf=driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[2]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(golf).build().perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a")));
		driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a")).click();
		Thread.sleep(5000);
		WebElement e=driver.findElements(By.xpath("//div[@class='noUi-base']")).get(1);
		//scroll down
		int y=e.getLocation().y;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+(y-30)+")");
		
		act.clickAndHold(e).moveByOffset(100, 0).release().build().perform();
		
		
	}
}
