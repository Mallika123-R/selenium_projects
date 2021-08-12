package zoho.managers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class WebDriverManager {
	
	WebDriver driver;
	ExtentTest test;
	Properties prop;
	FileInputStream fs;
	SoftAssert softassert;
	
	public WebDriverManager() throws IOException
	{
		try {
			prop=new Properties();
			 String path=System.getProperty("user.dir")+"//src//test//resources//project.properties";
	       fs=new FileInputStream(path);
	        prop.load(fs);
		 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		softassert=new SoftAssert();
	}
	
	
	
	@SuppressWarnings("deprecation")
	public void openBrowser(String browser)
	{
		log("Open Browser "+browser);
		System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\versiondriver\\msedgedriver.exe");
		if(browser.equals("Mozilla"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("Edge"))
		{
			log("browser is opening" +browser);
			driver=new EdgeDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//selenium 4 -7 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	public void navigate(String urlKey){
		log("Navigate to "+getProperty(urlKey));
		driver.get(getProperty(urlKey));	
		}

	public void click(String locatorKey)
	{
		log("click on "+getProperty(locatorKey));
		findElement(locatorKey).click();
	}
	public void type(String locatorKey, String data)
	{
		log("Typing in  "+getProperty(locatorKey));
		findElement(locatorKey).sendKeys(data);
	}
	public By getLocator(String locatorKey)
	{
		if(locatorKey.endsWith("_id"))
		return By.id(getProperty(locatorKey));
		
		else if(locatorKey.endsWith("_name"))
			return By.name(getProperty(locatorKey));
		
		else if(locatorKey.endsWith("_xpath"))
			return By.xpath(getProperty(locatorKey));
		
		else
			return By.cssSelector(locatorKey);
	
	}
	public WebElement findElement(String locatorKey)
	{
		By locator=getLocator(locatorKey);
		WebElement e =null;
		
		try {
			//presence and visible
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			//WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
			e=driver.findElement(locator);
			
		}catch(Exception ex)
		{
			//report failure
			logFailure("object not found "+locatorKey,true);
		}
		return e;
		
	}
	/**************Validation function*************************/
	
	public boolean verifyTitle(String expectedTitleKey)
	{
		String expectedTitle=getProperty(expectedTitleKey);
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
			return true;
		
		else
			return false;
			
	}
	//presence and visiblity of the element
	public boolean isElementPresent(String locatorKey)
	{
		By locator=getLocator(locatorKey);		
		try {
			//presence and visible
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
		}catch(Exception ex)
		{
			return false;
		}
		return true;
	}
	
	
	
	/*************Utility Functions*******************/
	public void init(ExtentTest test)
	{
		this.test=test;
	}
	public String getProperty(String key)
	{
		return prop.getProperty(key);
	}
	public void log(String msg)
	{
		System.out.println(msg);
		test.log(Status.INFO,msg);
	}
	public void logFailure(String msg, boolean stopExecution)
	{
		System.out.println("FAILURE-----"+msg);
		//screenshot of the page and embedd in reports
		//faili extent report
		test.log(Status.FAIL, msg);
		//fail in testing cucumber
		//Assert.fail(msg);//stop the program
		softassert.fail(msg);
		
		if(stopExecution)
		{
			softassert.assertAll();
		}
	
	
	}
	public void quit()
	{
		if(softassert!=null)
		{
			softassert.assertAll();
		}
	}
	
	public int getLeadRowNumberWithCellData(String leadName)
	{
		List<WebElement> names=driver.findElements(getLocator("leadnames_css"));
		for(int i=0; i<names.size(); i++)
		{
			if(leadName.equalsIgnoreCase(names.get(i).getText()))
				return (i+1);
		}
		return -1; //not found
	}



	public void selectLeadCheckBox(int rowNum) {
		driver.findElement(By.cssSelector("lyte-exptable-tr:nth-child("+rowNum+") > lyte-exptable-td:nth-child(2) label")).click();
		
	}
	

}
