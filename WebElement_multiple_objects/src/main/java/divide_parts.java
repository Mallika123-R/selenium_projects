import java.util.List;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class divide_parts {
	public WebDriver driver;
	@Test
	public void linking() {
		String part1="//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[";
		String part2="]/a";
		SoftAssert softy=new SoftAssert();
		System.setProperty("webdriver.edge.driver","D:\\\\SeleniumPractice\\\\Drivers\\\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://edition.cnn.com");
		//driver.navigate().to("https://edition.cnn.com");
	
		int i=1;
		while(isElement(part1+part2))
			{
			String text=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(text);
			
			String url=driver.findElement(By.xpath(part1+i+part2)).getAttribute("href");
			System.out.println(url);
			
			boolean result=validate_response_code(url);
			softy.assertTrue(result,"Invalid code");
			
			driver.findElement(By.xpath(part1+i+part2)).click();
			System.out.println(driver.getTitle());
			driver.get("https://edition.cnn.com");
			i++;
			
		}
		
              softy.assertAll();
	}
	@Test
	public boolean validate_response_code(String url_href)
	{
	  int resp_code=0;
	  try {
		resp_code=Request.Get(url_href).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("Response codeof URL" +resp_code);
		
		if(resp_code==200)
		{
			return true;
		}
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
		  return false;
	}
          public boolean isElement(String element)
          {
        	  int s=driver.findElements(By.xpath(element)).size();
        	  if(s==0)
        	  {
        		  return false;
        	  }
        	  if(driver.findElement(By.xpath(element)).isDisplayed() && driver.findElement(By.xpath(element)).isEnabled())
        		  return true;
        	  
        	     return false;
        	  
          }
}
