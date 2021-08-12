package uploading_downloading;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webElement_functions.Testbase;

public class facebook extends Testbase{

	@Test
	public void fb() throws IOException {
		
		WebDriver driver=launchdriver("Edge");
		driver.get("http://facebook.com");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("wadhwa12miley@gmail.com");
	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("#76Godjudge#76");
	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
	 driver.findElement(By.xpath("//span[text()='Mallika Wadhwa']")).click();
	
	 driver.findElement(By.xpath("//div[@aria-label='Update Profile Picture']")).click();
	 driver.findElement(By.xpath("//div[@aria-label='Upload Photo']")).click();
	 new ProcessBuilder(System.getProperty("user.dir")+"//autoIT//facebook.exe").start();
		
	}
}
