package pilot_project;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class basic_project extends Testbase {

	@Test
	public void appt() throws IOException, InterruptedException {
		launchdriver("Edge");
		log("open browser edge");
		driver.get(prop.getProperty("url"));
	
		driver.findElement(By.linkText(prop.getProperty("doctor_name"))).click();
		//waitForPageToLoad();
		//explicit wait
		
		//Thread.sleep(5000);
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(getObjectLocator("name_id")));
		//enter name
		if(! isElementPresent("name_id"))
		failAndStopTest("name field is not present/visible");
			log("name field is present");
        driver.findElement(getObjectLocator("name_id")).sendKeys(prop.getProperty("First_name"));
		driver.findElement(getObjectLocator("Email_id")).sendKeys(prop.getProperty("email_id"));
		driver.findElement(getObjectLocator("Mobile_id")).sendKeys(prop.getProperty("mobile_no"));
		
		String expected_gender[]=prop.getProperty("expected_gender_opt").split(",");
		WebElement gender=driver.findElement(getObjectLocator("gender_id"));
		
		
		Select s=new Select(gender);
		s.selectByVisibleText("Female");
		List<WebElement> genders=s.getOptions();
		
		if(genders.size()!=expected_gender.length)
			failAndStopTest("gender list is not ok");
		  
		
		  for(int i=0; i<genders.size(); i++)
		  {
			  System.out.println(expected_gender[i]+"...."+genders.get(i).getText());
		  }
		  log("gender list is present");
		//dob
		if(! isElementPresent("DOB_id"))
		{
			failAndStopTest("DOB field is not present/visible");
			log("DOB field is present");
		}
		driver.findElement(By.id(prop.getProperty("DOB_id"))).click();
		date(prop.getProperty("dob_val"));
		
		//uid
		if(driver.findElement(getObjectLocator("uid_css")).isDisplayed())
			failAndStopTest("Uid is displayed");
		   log("UID field is present");
		
			driver.findElement(getObjectLocator("yes_radio_css")).click();
		
		if(!driver.findElement(getObjectLocator("uid_css")).isDisplayed())
		failAndStopTest("Uid is not displayed");
	  
		
		driver.findElement(getObjectLocator("uid_css")).sendKeys(prop.getProperty("uid_val"));
		driver.findElement(getObjectLocator("no_radio_css")).click();
		
		if(driver.findElement(getObjectLocator("uid_css")).isDisplayed())
		failAndStopTest("Uid is displayed");
		driver.findElement(getObjectLocator("yes_radio_css")).click();
	   String val_uid=driver.findElement(getObjectLocator("uid_css")).getAttribute("value");
		System.out.println("Enter value of uid\t=" + val_uid);
		
		if(!val_uid.equals(prop.getProperty("uid_val")))
			failAndStopTest("Uid value is not correct");
			
		//prefered date_1
		if(! isElementPresent("preferred_date1_id"))
		{
			failAndStopTest("this prefered_date1 field is not present/visible");
			log("this prefered_date1 field is present/visible");
		}
		driver.findElement(getObjectLocator("preferred_date1_id")).click();
		date(prop.getProperty("date1_val"));
		
		//Time1
		WebElement time=driver.findElement(getObjectLocator("Time1_id"));
		Select s1=new Select(time);
		s1.selectByValue("10");
		WebElement select1=s1.getFirstSelectedOption();
		System.out.println(select1.getText());
		
		WebElement sec1=driver.findElement(getObjectLocator("minute_sec1_id"));
		Select s1_sec=new Select(sec1);
		s1_sec.selectByValue("30");
		WebElement select1_sec=s1_sec.getFirstSelectedOption();
		System.out.println(select1_sec.getText());
		
		
		
		//prefered date_2
				if(! isElementPresent("preferred_date2_id"))
				{
					failAndStopTest("this prefered_date2 field is not present/visible");
					log("this prefered_date2 field is present/visible");
				}
				driver.findElement(getObjectLocator("preferred_date2_id")).click();
				date(prop.getProperty("date2_val"));
		
		
				//Time2
				WebElement time2=driver.findElement(getObjectLocator("Time2_id"));
				Select s2=new Select(time2);
				s1.selectByValue("11");
				WebElement select2=s1.getFirstSelectedOption();
				System.out.println(select2.getText());
				
				WebElement sec2=driver.findElement(getObjectLocator("minute_sec2_id"));
				Select s2_sec=new Select(sec2);
				s2_sec.selectByValue("30");
				WebElement select2_sec=s2_sec.getFirstSelectedOption();
				System.out.println(select2_sec.getText());
				
	}
	public void date(String date_val)
	{
		String month_year_Displayed=driver.findElement(getObjectLocator("month_year_css")).getText();
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
					//forward icon
					driver.findElement(getObjectLocator("calender_next_xpath")).click();
				}
				else if(dateToBeSelected.compareTo(current_date)==-1)
				{
					//back_icon
					driver.findElement(getObjectLocator("calender_back_xpath")).click();
				}
		
				month_year_Displayed=driver.findElement(getObjectLocator("month_year_css")).getText();
				System.out.println("update month and year is displayed" + month_year_Displayed);
			}
			
			
			driver.findElement(By.xpath("//a[text()='"+ day + "']")).click();
			//System.out.println("select update date\t" + day);
		} 
		
		
		
		catch (ParseException e) {
			
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}
	public boolean isElementPresent(String locator_key)
	{
		//presence
		WebElement e=null;
		/*try {
		e=driver.findElement(By.id(locator));
		}
		catch(Exception ex)
		{
			System.out.println("Exception while extracting object" +ex.getMessage());
		return false;
		}
		//visibility
		System.out.println("check visibilty of name" + e.isDisplayed());
		if(!e.isDisplayed())
			return false;
		
		return true;*/
		By locator=getObjectLocator(locator_key);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		return true;
	}
	
	//code for page load
	/*public void waitForPageToLoad() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i=0;
		
		while(i!=10){
		String state = (String)js.executeScript("return document.readyState;");
		System.out.println(state);

		if(state.equals("complete"))
			break;
		else
			wait(2);

		i++;
		}
		// check for jquery status
		i=0;
		while(i!=10){
	
			Long d= (Long) js.executeScript("return jQuery.active;");
			System.out.println(d);
			if(d.longValue() == 0 )
			 	break;
			else
				 wait(2);
			 i++;
				
			}
		
		}*/
	
	public By getObjectLocator(String locator_key)
	{
		if(locator_key.endsWith("_id"))
			return By.id(prop.getProperty(locator_key));
		else if(locator_key.endsWith("_name"))
			return By.name(prop.getProperty(locator_key));
		else if(locator_key.endsWith("_css"))
			return By.cssSelector(prop.getProperty(locator_key));
		else
			return By.xpath(prop.getProperty(locator_key));
		
	}
	
}
