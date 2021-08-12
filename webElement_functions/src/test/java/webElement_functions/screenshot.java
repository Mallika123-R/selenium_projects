package webElement_functions;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class screenshot extends Testbase {
  WebDriver driver;
  
 @Test
  public void screen()
  {
	 driver=launchdriver("Edge");
	 driver.get("http://demo.guru99.com/V4");
	 takescreenshot();
	 System.out.println("Take screenshot successfull");
  }
	@Test
	public void takescreenshot()
	{
		Date d=new Date();
		String dateformat=d.toString().replace(":", "_").replace(" ","_")+".png";
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File(System.getProperty("user.dir")+"//screenshot//"+dateformat);
		try {
			FileUtils.copyFile(srcfile,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
