package window_mngmt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alert extends Testbase {

	@Test
	public void rediff()
	{
		WebDriver driver=launchdriver("Edge");
		driver.get("https://www.rediffmailpro.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//*[@id='dd1']/form/input[7]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		org.openqa.selenium.Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		driver.switchTo().defaultContent();
		
		
	}
}
