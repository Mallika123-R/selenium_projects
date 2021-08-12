package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webElement_functions.Testbase;

public class google extends Testbase{
	
	@Test
	public void google() {
	WebDriver driver=launchdriver("Edge");
	driver.get("https://google.com");
	//div.sbl1>span
	driver.findElement(By.name("q")).sendKeys("hello");
	//driver.findElement(By.cssSelector("div.sbl1>span")).sendKeys("hello");
	}
	
}
