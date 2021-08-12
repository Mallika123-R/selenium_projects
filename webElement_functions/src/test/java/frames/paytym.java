package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webElement_functions.Testbase;

public class paytym extends Testbase{

	 public WebDriver driver;
	@Test
	public void frames() throws InterruptedException
	{
		driver=launchdriver("Edge");
		driver.get("https://paytm.com");
		Thread.sleep(5000);
		waitForPageToLoad();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[4]/div")).click();
		List<WebElement> iframes= driver.findElements(By.tagName("iframe"));
		System.out.println("Total iframes\t"+iframes.size());
		
		for(int i=0; i<iframes.size(); i++)
		{
		driver.switchTo().frame(i);
		int s=driver.findElements(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div/div[2]/qr-code-login/div/div[2]/div")).size();
		if(s==0)
			driver.switchTo().defaultContent();
		
		else
			break;
		}
		String txt=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div/div[2]/qr-code-login/div/div[2]/div")).getText();
		System.out.println(txt);
	}
	public void waitForPageToLoad() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i=0;
		// page to load 100% -- wait for max 20 secs
		while(i!=10){
			String state = (String)js.executeScript("return document.readyState;");
			System.out.println(state);// complete, loading, interactive
	
			if(state.equals("complete"))
				break;
			else
				Thread.sleep(2000);
	
			i++;
		}
		
	}
}
