package Wb_tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import window_mngmt.Testbase;

public class custom_webTable extends Testbase {

	  public WebDriver driver;
	@Test
	public void custm_funtn() {
		String Indices="S&P BSE 200";
		driver=launchdriver("Edge");
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
	    //List<WebElement> names=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	     int row_no=get_custom("//table[@class='dataTable']",Indices,"xpath");
	     Assert.assertTrue(row_no!=-1,"company not found---"+Indices);
	     
	     String price=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+row_no+"]/td[3]")).getText();
               System.out.println(Indices+"---"+price);	
	}
	 
	public int get_custom( String locator, String data, String path) {
		List<WebElement> rows=null;
		
		if(path.equals("xpath"))
		 rows=driver.findElements(By.xpath(locator+"/tbody/tr"));

		else 
			rows=driver.findElements(By.cssSelector(locator+">tbody>tr"));
			
		
		for(int rnum=0; rnum<rows.size(); rnum++)
		{
			WebElement row=rows.get(rnum);
			List<WebElement> column=row.findElements(By.tagName("td"));
			//System.out.println("check rows/t" +column);
			
			for(int cnum=0;cnum<column.size(); cnum++)
			{
				//System.out.println(column.get(cnum).getText());
				if(data.equals(column.get(cnum).getText()))
					return (rnum+1);
			}
			
			//System.out.println("____");
		    
		}
		return -1;

	}
}
