package Identify_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class identify_xpath extends Testbase {
	/*@Test
	public void linkedln() {
		WebDriver driver=launchdriver("Edge");
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		
	  // WebElement uname=driver.findElement(By.id("username"));
		//partial xpath
		WebElement uname=driver.findElement(By.xpath("//*[@id='username']"));
		uname.sendKeys("Mallika123");
		
		System.out.println(uname.getLocation().x);
		System.out.println(uname.getLocation().y);
		
		//complete xpath 
		
		String text= driver.findElement(By.xpath("html/body/div/main/div[2]/div[1]/div[1]/h1")).getText();
		System.out.println(text);
		driver.findElement(By.id("password")).sendKeys("milley123");
		
		
		
			
	
	}
	//flipkart
   @Test
   public void login()
   {
	   WebDriver driver=launchdriver("Edge");
		driver.get("https://www.flipkart.com");
		
		WebElement username=driver.findElement(By.xpath("//form[@autocomplete=\"on\"]/div/input"));
		username.sendKeys("Mallika123");
		
   }*/
   
  //university of california
   @Test
   public void uni()
   {
	   WebDriver driver=launchdriver("Edge"); 
	   driver.get("https://www.universityofcalifornia.edu");
	  WebElement abc=driver.findElement(By.xpath("//div[text()='UC Newsroom']"));
	  String txt=abc.getText();
	   
	   System.out.println(txt);
	   
	   

	
	   
   }
   
	
}
