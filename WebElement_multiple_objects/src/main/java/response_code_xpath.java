import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class response_code_xpath {

	@Test
	public void link() {
		System.setProperty("webdriver.edge.driver","D:\\\\SeleniumPractice\\\\Drivers\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://edition.cnn.com");
		SoftAssert softy=new SoftAssert();
		List<WebElement> links=driver.findElements(By.xpath("//*[@id='header-nav-container']/div/div[1]/div/div[2]/nav/ul/li/a"));
		System.out.println("Total links-->" +links.size());
		
		for(int i=0; i<links.size(); i++)
		{
			System.out.println(i+"--"+links.get(i).getText()); 
			String url=links.get(i).getAttribute("href");
			System.out.println(url);
			boolean result=validate_response_code(url);
			softy.assertTrue(result,"Invalid code");
			links.get(i).click();
			System.out.println(driver.getTitle());
			driver.get("https://edition.cnn.com");
			links=driver.findElements(By.xpath("//*[@id='header-nav-container']/div/div[1]/div/div[2]/nav/ul/li/a"));
			
			
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
          
}
