package Wb_tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import window_mngmt.Testbase;

public class webTables extends Testbase {
	
	@Test
	public void table()
	{
		String Indices="S&P BSE 500";
		WebDriver driver=launchdriver("Edge");
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
	    List<WebElement> names=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	    
	    //last traded
	    List<WebElement> traded=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
	    System.out.println("Total names\t"+names.size());
	    System.out.println("Total trades\t" +traded.size());
	    System.out.println("-----------");
	    
	    for(int i=0; i<names.size(); i++)
	    {
	    	if(Indices.equals(names.get(i).getText()))
	    	{
	    	System.out.println(names.get(i).getText()+"-----"+traded.get(i).getText());
	    	break;
	    	}
	    	
	    	else {
	    		System.out.println("not found");}
	    }

	}
	
	
}
