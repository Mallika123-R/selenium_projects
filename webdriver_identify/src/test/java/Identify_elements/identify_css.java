package Identify_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class identify_css extends Testbase{

	@Test
	public void uni()
	   {
		   WebDriver driver=launchdriver("Edge"); 
		   driver.get("https://www.linkedin.com/login?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fcompany%2Flinkedin&fromSignIn=true&trk=organization_guest_nav-header-signin");
		  WebElement abc=driver.findElement(By.cssSelector("#username"));
		  abc.sendKeys("Hello");//input[id=username] or input#username
		  //String txt=abc.getText();
		   
		  //111`		23 System.out.println(txt);
		   
		   

		
		   
	   }
}
