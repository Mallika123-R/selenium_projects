package Keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class Application_key extends Generic_key {

	public Application_key() throws IOException
	{
		String Path=System.getProperty("user.dir")+"//src//test//resources//prod.properties";
		prop= new Properties();
		
		FileInputStream fs=new FileInputStream(Path);
		prop.load(fs);
		
	}
	public void autosuggestion(String locatorKey, String data)
	{
		getElement(locatorKey).sendKeys(prop.getProperty(data));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(prop.getProperty("autoSuggestion_css"))));
		
		List<WebElement> auto=driver.findElements(By.cssSelector(prop.getProperty("autoSuggestion_css")));
		
		for(int i=0; i<auto.size(); i++)
		{
			System.out.println(auto.get(i).getText());
			if(auto.get(i).getText().equals("HSR Layout"))
			{
				System.out.println("HSR Layout is clicked---"+auto.get(i).getText());
				auto.get(i).click();
				break;
			}
		}
		
	}
	public void scrolled()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
	}
	public void scrolled_secnd()
	{    
		JavascriptExecutor jssec=(JavascriptExecutor)driver;
		jssec.executeScript("window.scrollBy(0,400)");
	}
	public void frame(String framelocatorKey, String locatorKey)
	{
		System.out.println("--switch to frame----");
		WebElement frame=getElement(framelocatorKey);
		if(frame.isEnabled())
		{
			driver.switchTo().frame(getElement(framelocatorKey));
			getElement(locatorKey).click();
			driver.switchTo().defaultContent();
		}
		else
		scrolled();
		
	}
	public void frame_popup(String locatorKey)
	{
		System.out.println("--switch to 2nd frame----");
		driver.switchTo().frame(0);
		getElement(locatorKey).click();
		driver.switchTo().defaultContent();
	}
	public void dropdown_BHK(String locatorKey)
	{
		  getElement(locatorKey).click();
		 List<WebElement> myElements = driver.findElements(By.xpath(prop.getProperty("selectBHK_xpath")));
	       for(int i=0; i<myElements.size(); i++)
			{
				System.out.println(myElements.get(i).getText());
				if(myElements.get(i).getText().equals("3 BHK"))
				{
					System.out.println("3BHK is clicked---"+myElements.get(i).getText());
					myElements.get(i).click();
					break;
				}
			}
	}
	public void link()
	{
		/*WebElement web=getElement(locatorKey);
		Actions act=new Actions(driver);
		act.moveToElement(web).build().perform();*/
		driver.findElement(By.linkText("WEATHER")).click();
		
		
	}
	public void checkbox(String locatorKey, String data)
	{
		List<WebElement> checked= driver.findElements(By.cssSelector(prop.getProperty(locatorKey)));
		System.out.println("Total no. of checkbox " + checked.size());
		for(int i=0; i<checked.size(); i++)
		{
			//System.out.println(checked.get(i).getAttribute("id"));
			if(checked.get(i).getAttribute("id").equals(prop.getProperty(data)))
			{
				System.out.println("Jalandhar is clicked---"+checked.get(i).getAttribute("id"));
				checked.get(i).click();
				break;
			}
		}
		
		
	
	}
	public void TempCity(String locatorKey, String data)
	{
		List<WebElement> temp=driver.findElements(By.cssSelector(prop.getProperty(locatorKey)));
	    //Random ran=new Random();
	    //int i=ran.nextInt(temp.size());
	    //System.out.println(temp.get(i));
	    for(int i=0; i<temp.size(); i++)
		{
			System.out.println(temp.get(i).getText());
			if(temp.get(i).getText().equals(prop.getProperty(data)))
			{
				System.out.println("Weather details---"+temp.get(i).getText());
				temp.get(i).click();
				break;
			}
		}
	   // temp.get(i).click();
	    
	    
	
	}
	/*public void dropdown(String locatorKey)
	{
		getElement(locatorKey).click();
		List <WebElement> elementToSelect = driver.findElements(By.xpath(prop.getProperty("selectBHK_xpath")));

				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[4].click();", elementToSelect);
	}*/
	public void windowhandle()
	{
		String MainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> I1=s1.iterator();
		
		while(I1.hasNext())
		{
			String childWindow=I1.next();
			if(!MainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);  
				scrolled_secnd();
				getElement("wrongInfo_xpath").click();
				
			}
		}
		//driver.switchTo().window(MainWindow);
	}
	public void feedback(String locatorKey)
	{
		String ExpectedResult="Thank you for the feedback";
		String text=getElement(locatorKey).getText();
		String actualResult=text;
		Assert.assertEquals(ExpectedResult,actualResult);
		System.out.println(actualResult);
		
	}
	private void AssertEquals() {
		// TODO Auto-generated method stub
		
	}
	


}
	

