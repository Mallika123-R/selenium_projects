package webElement_functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Attribute_dropDown extends Testbase {
	
	/*@Test
	public void attribute()
	{
		
	   WebDriver driver=launchdriver("Edge"); 
	   driver.get("https://www.zoho.com/signup.html");
	  WebElement abc=driver.findElement(By.cssSelector("#emailfield"));
	  abc.sendKeys("Hello@gmail.com");
	  String a=driver.findElement(By.cssSelector("#emailfield")).getAttribute("value");
	  System.out.println("value of attribute"+a);//input[id=username] or input#username
	  //String txt=abc.getText();
	  
	  driver.quit();
	}*/
	
	@Test
	public void drop_down() {
		WebDriver driver=launchdriver("Edge"); 
		   driver.get("https://demoqa.com/select-menu");
		   WebElement droplist=driver.findElement(By.id("oldSelectMenu"));
		  Select s=new Select(droplist);
		  /* s.selectByIndex(4);
		 // s.selectByIndex(3);
		  //WebElement select=s.getFirstSelectedOption();
		  //System.out.println(select.getText());
		   
		   List<WebElement> se=s.getAllSelectedOptions();
		 // System.out.println(se.getText());
		   //driver.quit();
		   for(int i=0; i<se.size(); i++)
		   {
			   String sel=se.get(i).getText();
			   System.out.println("Text is "+sel);
		   }*/
		   
		   //Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
	        
		// Get the first selected option of the dropdown
		List<WebElement> se = s.getAllSelectedOptions();
		for(int i=0; i<se.size(); i++)
		   {
			   String sel=se.get(i).getText();
			   System.out.println("Text is "+sel);
		   }
		//System.out.println(firstSelectedOption.getText());
	}
	
}
