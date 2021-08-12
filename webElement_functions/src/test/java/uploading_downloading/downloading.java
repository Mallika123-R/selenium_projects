package uploading_downloading;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import webElement_functions.Testbase;

public class downloading extends Testbase {

	@Test
	public void load() throws NullPointerException, IOException, InterruptedException
	{
		System.setProperty("webdriver.ie.driver","D:\\SeleniumPractice\\Drivers\\IEdriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		//driver.get("http://yahoo.com");
		//WebDriver driver=launchdriver("Mozilla");
		driver.get("https://www.qtpselenium.com/downloads/download.html");
		/*FirefoxOptions opt=new FirefoxOptions();
		FirefoxProfile prof=new FirefoxProfile();
		prof.setPreference("browser.download.folderList", 2);
	    opt.setProfile(prof);*/
		//Thread.sleep(3000);
		String url=driver.findElement(By.linkText("xls download")).getAttribute("href");
		//String url=driver.findElement(By.linkText("Download")).getAttribute("href");
		System.out.println(url);
		driver.findElement(By.linkText("xls download")).click();
		FileDownloader file=new FileDownloader(driver,"D:\\SeleniumPractice\\");
		file.downloader(url);
		//driver.findElement(By.linkText("xls download")).click();
		
		
		
	}
}
