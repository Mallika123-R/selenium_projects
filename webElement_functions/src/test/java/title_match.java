import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class title_match {

	@Test
	public void test() {
		//System.setProperty("webdriver.edge.driver", "D:\\SeleniumPractice\\Drivers\\msedgedriver.exe");
		System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*String expectedTitle = "Avinash Mishra Blogger: Learn Selenium WebDriver, Automation Framework, QA, SEO & Digital Marketing | Inviul Blog | Inviul";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);*/
		//driver.close();
		//driver.quit();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	      // getTitle() to obtain page title
	      System.out.println("Page title is : " + driver.getTitle());
	      String actualTitle=driver.getTitle();
	      String expectedTitle="Abouts Careers at Tutorials Point - Tutorialspoint";
	      Assert.assertEquals(actualTitle, expectedTitle);
	      Boolean verifyTitle=actualTitle.equals("About Careers at Tutorials Point - Tutorialspoint");
	      assertTrue(verifyTitle);
	     // driver.close();
	}

}