
package Identify_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class elements_by_name_id extends Testbase{

	@Test
	public void linkedln() {
		WebDriver driver=launchdriver("Mozilla");
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("Mallika123");
		
		System.out.println(uname.getLocation().x);
		System.out.println(uname.getLocation().y);
		
		driver.findElement(By.id("password")).sendKeys("milley123");
		
	}
}
