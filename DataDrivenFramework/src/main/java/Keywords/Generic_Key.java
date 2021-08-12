package Keywords;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.IIOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.utils.FileUtil;

import Extent_manager.extent_report;

public class Generic_Key {

	public WebDriver driver;
	public Properties prop;
	public Properties envprop;
	public ExtentReports rep;
	public ExtentTest test;
	public SoftAssert softAssert;
	@Test
	public void OpenBrowser(String browsername)
	{
		if(browsername.equals("Mozilla"))
		{   
			log("browser is opening" +browsername);
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
			//log
			//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"logs\\firefox.log");
			FirefoxOptions ops=new FirefoxOptions();
			 FirefoxProfile fb=new FirefoxProfile();
			FirefoxDriver fd=new FirefoxDriver(ops);
			
			//ProfilesIni allprofile=new ProfilesIni();
			//FirefoxProfile prof=allprofile.getProfile("Feb2021");
			
			//disable notification
			fb.setPreference("dom.webnotificitions.enabled", false);
			//fd.get("http://pushengage.com/demo");
			
			//SSL error
			fb.setAcceptUntrustedCertificates(true);
			fb.setAssumeUntrustedCertificateIssuer(false);
			ops.setProfile(fb);
			driver=new FirefoxDriver(ops);
		}
		
		else if(browsername.equals("Edge"))
		{
			log("browser is opening" +browsername);
			System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\msedgedriver.exe");
			 
			//log
			//System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY,"logs//edge.log");
			EdgeOptions ed=new EdgeOptions();
			ed.addArguments("disable-notifications");
			ed.addArguments("Start-maximized");
			ed.addArguments("ignore-certificate-error");
			
			driver=new EdgeDriver(ed);	
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	}
	
	public void navigate(String urlKey)
	{
		log("Navigation to---"+urlKey);
		driver.get(prop.getProperty(urlKey));
		
	}
	
	public void click(String locatorKey)
	{
		log("clicking on---"+locatorKey);
		//String locator=prop.getProperty(locatorKey);
		
		getElement((locatorKey)).click();
	}
	public void type(String locatorKey, String data)
	{
		log("typing in--"+locatorKey+".Data"+data);
		getElement((locatorKey)).sendKeys(data);
		//getElement(locator).sendKeys(data);
	}
	public void clear(String locatorKey)
	{
		log("field is clear-->enter your portfolio"+locatorKey);
		getElement(locatorKey).clear();
	}
	public WebElement getElement(String locatorKey)
	{
		//check the presence
		if(!isElementPresent(locatorKey))
		//report failure
			log("element is not presence--"+locatorKey);

		
		//check the visibility
				if(!isElementVisible(locatorKey))
				{//report failure
					log("element is not visible--"+locatorKey);
				}
				else
					log("locator is visible--"+locatorKey);
				//extract the element
				
		WebElement e=driver.findElement(getlocator(locatorKey));
		return e;
	}
	public boolean isElementPresent(String locatorKey)
	{
		System.out.println("check presence of locator--"+locatorKey);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		try{
			wait.until(ExpectedConditions.presenceOfElementLocated(getlocator(locatorKey)));
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	public boolean isElementVisible(String locatorKey)
	{
		log("check visibility of locator--"+locatorKey);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(getlocator(locatorKey)));
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	
	
	
	public By getlocator(String locatorKey)
	{
		By by=null;
		if(locatorKey.endsWith("_id"))
		  by=By.id(envprop.getProperty(locatorKey));
		
		else if(locatorKey.endsWith("_xpath"))
			by=By.xpath(envprop.getProperty(locatorKey));
		
		else if(locatorKey.endsWith("_css"))
			by=By.cssSelector(envprop.getProperty(locatorKey));
		
		else if(locatorKey.endsWith("_name"))
			by=By.name(envprop.getProperty(locatorKey));
		
		return by;
	}
	public void log(String msg)
	{
		System.out.println(msg);
		test.log(Status.INFO, msg);
	}
	public void reportfail(String failure_msg, boolean stopOnFailure)
	{
		System.out.println(failure_msg);
		test.log(Status.FAIL,failure_msg);
		screenshot();
		softAssert.fail(failure_msg);
		if(stopOnFailure)
			assertall();
	}
	public void assertall()
	{
		softAssert.assertAll();
		Reporter.getCurrentTestResult().getTestContext().setAttribute("critical_Fail", "Y");
	}
	public void screenshot()
	{
		//name of file format
		Date d=new Date();
		String screenshot_file=d.toString().replace(":", "_").replace(" ", "_")+".png";
		//store in file and take screenshot
         File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try {
        	 //get the dynamic folder
        	 FileUtils.copyFile(srcfile, new File(extent_report.screenshotpath+"//"+screenshot_file));
             //put in reports
        	 test.log(Status.INFO, "screenshot--->"+test.addScreenCaptureFromPath(extent_report.screenshotpath+"//"+screenshot_file));
	       }
         catch(IOException e)
         {
        	 e.printStackTrace();
        	 }
}
	
	public void SelectFromVisibleText(String locatorKey, String data)
	{
		Select s=new Select(getElement(locatorKey));
		s.selectByVisibleText(data);
	}
	public void clickEnterButton(String LocatorKey)
	{
		log("click on enter button");
		getElement(LocatorKey).sendKeys(Keys.ENTER);
	}
	public void waitForPageToLoad() throws InterruptedException{
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
		
		}
	public int getRowNumwithCellData(String tableLocator,String data)
	{
		WebElement table=getElement(tableLocator);
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int rNum=0; rNum<rows.size(); rNum++)
		{
			WebElement row=rows.get(rNum);
			List<WebElement> cells=table.findElements(By.tagName("td"));
		     for(int cNum=0; cNum<cells.size(); cNum++)
		     {
		    	 WebElement cell=cells.get(cNum);
		    	System.out.println("Text-->"+cell.getText());
		    	 if(!cell.getText().trim().equals(""))
		    		 if(data.startsWith(cell.getText()))
		    			 System.out.println("Text-->"+cell.getText());
		    			 return(rNum+1);
		     }
		}
		    return -1;
			
				
	}
}
