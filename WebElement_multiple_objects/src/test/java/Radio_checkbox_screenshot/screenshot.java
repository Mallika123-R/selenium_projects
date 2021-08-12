package Radio_checkbox_screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class screenshot {
	
	WebDriver driver;
	@Test
	public void screenshot()
	{
	System.setProperty("webdriver.edge.driver","D:\\\\SeleniumPractice\\\\Drivers\\\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://www.chabadpotomac.com/templates/section_cdo/aid/4929870/jewish/WOMENS-PROGRAMS.htm");
	takescreenshot("D://sample.jpg");
	WebElement e=driver.findElement(By.xpath("//div[@id='navigation']"));
	partial_screenshot(e, "D://menu.jpg");
	}
	
	//complete screenshot
	public void takescreenshot(String fullpath)
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File(fullpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	//Partial screenshot
		public void partial_screenshot(WebElement ee, String path)
		{
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			BufferedImage fullimg;
			try {
		fullimg=ImageIO.read(srcfile);
		
		//location
		Point pt=ee.getLocation();
		
		//width and height
		int eewidth=ee.getSize().getWidth();
		int eeheight=ee.getSize().getHeight();
		
		//crop image 
		BufferedImage eescreenshot=fullimg.getSubimage(pt.getX(), pt.getY(),eewidth,eeheight);
		ImageIO.write(eescreenshot, "png", srcfile);
		
				FileUtils.copyFile(srcfile, new File(path));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
}
