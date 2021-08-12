package com.Interview_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class action_ex {
	
	@Test
	public void exp()
	{
		System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\driver\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://www.google.com");
	    Actions act=new Actions(driver);
	     
	    /*WebElement e=driver.findElement(By.xpath("//li[@class='first']/a"));
	    System.out.println("Right click menu is working");
	    
	      act.moveToElement(e).build().perform();
	    //act.contextClick(e).build().perform();
	      
	    driver.findElement(By.xpath("//ul[@class='subnav']/li[3]/a")).click();*/
	    
	  
	    driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']"));
	    System.out.println("Right click menu is working");
	    
	    //act.contextClick(e).perform();
	    act.sendKeys("m").perform();
	    
	    
	    
	
	}

	

}
