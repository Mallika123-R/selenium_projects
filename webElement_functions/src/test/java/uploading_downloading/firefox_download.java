package uploading_downloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import webElement_functions.Testbase;

public class firefox_download extends Testbase{

	@Test
	public void firefox()
	{
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
		FirefoxOptions opt=new FirefoxOptions();
		FirefoxProfile prof=new FirefoxProfile();
		prof.setPreference("browser.download.folderList", 2);
		prof.setPreference("browser.download.dir", "D:\\SeleniumPractice\\");
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
	    opt.setProfile(prof);
	    WebDriver driver=new FirefoxDriver(opt);
	    driver.get("https://www.qtpselenium.com/downloads/download.html");
	    driver.findElement(By.linkText("xls download")).click();
	}
}
