package Keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

public class Application_key extends validation_key {

	public  Application_key() throws IOException{
		String path=System.getProperty("user.dir")+"//src//test//resources//prod.properties";
        
		prop=new Properties();
        envprop=new Properties();
        softAssert=new SoftAssert();
        FileInputStream fs;
		try {
			fs = new FileInputStream(path);
			 prop.load(fs);
	      //String env=System.getProperty("env")+".Properties";
			 path=System.getProperty("user.dir")+"//src//test//resources//env.properties";
	       fs=new FileInputStream(path);
	        envprop.load(fs);
		 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("loginsubmit_id"));
       
	}
	
	/*public void defaultLogin() throws InterruptedException
	{
		navigate("url");
		type("username_id",prop.getProperty("admin_UserName"));
		type("password_id",prop.getProperty("adminPassword"));
		click("loginsubmit_id");
		//waitForPageToLoad();
		wait(5);*/
		
	
	public void select_date(String date_val)
	{
		 log("selecting date "+date_val);
		String month_year_Displayed=(getElement("stock_datePicker_css")).getText();
		System.out.println(month_year_Displayed);
		
		SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
	    Date dateToBeSelected;
		try {
			dateToBeSelected = sd.parse(date_val);
			Date current_date=new Date();
			System.out.println(dateToBeSelected.toString());
			
			//compare dates
			//System.out.println(d.compareTo(dateToBeSelected));
			
			//extract day
			String day=new SimpleDateFormat("d").format(dateToBeSelected);
			System.out.println("select date\t" + day);
			
			//extract month
			String month=new SimpleDateFormat("MMMM").format(dateToBeSelected);
			System.out.println("Select month\t" + month);
			
			//extract year
			String Year=new SimpleDateFormat("yyyy").format(dateToBeSelected);
			System.out.println("Select year\t" + Year);
			
			String month_year_selected=month+" "+Year;
			System.out.println("month year to be selected"+ month_year_selected);
			
			while(!month_year_selected.equals(month_year_Displayed))
			{
				//click on forward and backword icon
				if(dateToBeSelected.compareTo(current_date)==1)
				{
					//forward icon for month
					getElement("calander_iconforward_xpath").click();
				}
				else if(dateToBeSelected.compareTo(current_date)==-1)
				{
					//back_icon
					getElement("calender_back_xpath").click();
				}
		
				month_year_Displayed=getElement("stock_datePicker_css").getText();
				System.out.println("update month and year is displayed" + month_year_Displayed);
			}
			
			driver.findElement(By.xpath("//td[text()='"+day+"']")).click();
			//getElement("daySelect_xpath").click();//table[@class='dpTable']/tbody/tr
			
			//table[@class='dpTable']/tbody/tr/td
			//System.out.println("select update date\t" + day);
		} 
		
		
		
		catch (ParseException e) {
			
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}
	public void verify_stock_added()
	{
		
	}
	public void goToBuySell(String companyname)
	{
		log("selecting the company row--" +companyname);
		int row=getRowNumwithCellData("stockTable_css",companyname);
		if(row==-1)
			log("stock is not present in the list");
		
		driver.findElement(By.xpath("//table[@id='stock']/tbody/tr["+row+"]/td[1]")).click();
		driver.findElement(By.xpath("//table[@id='stock']/tbody/tr["+row+"]//input[@class='buySell']")).click();
		
		
	}
	
	public void setReport(ExtentTest test)
	{
		this.test=test;
	}
	public int findCurrentStockQuantity(String companyname)
	{
		log("finding current stock quality for" +companyname);
		int row=getRowNumwithCellData("stockTable_css",companyname);
		if(row==-1)
		{
			log("current stock quantity is not present in the list");
		     return 0;
		}
		System.out.println("stock quantity is  ");
		String quantity=driver.findElement(By.cssSelector("table#stock>tbody>tr:nth-child("+row+")>td:nth-child(4)")).getText();
		
		log("current stock quantity"+quantity);
		     return Integer.parseInt(quantity);
		
	}
	public void GotoTransactionHistory(String companyname)
	{
		log("selecting the company row--"+companyname);
		int row=getRowNumwithCellData("stockTable_css",companyname);
		if(row==-1)
			log("stock  is not present in the list"); 
		
		driver.findElement(By.cssSelector("table#stock>tbody>tr:nth-child("+row+")>td:nth-child(1)")).click();
		driver.findElement(By.cssSelector("table#stock>tbody>tr:nth-child("+row+") input.equityTransaction")).click();
		
	}
	
	
}
