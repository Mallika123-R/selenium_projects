package browsers;

//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class selenium_basics {

	@Test
	public void testap(){
		/*System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\msedgedriver.exe");
		EdgeDriver cd=new EdgeDriver();
		cd.get("http://yahoo.com");*/
		
		/*System.setProperty("webdriver.chrome.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
		FirefoxDriver cd=new FirefoxDriver();
		cd.get("http://yahoo.com");*/
		
		System.setProperty("webdriver.ie.driver","D:\\SeleniumPractice\\Drivers\\IEdriverServer.exe");
		InternetExplorerDriver cd=new InternetExplorerDriver();
		cd.get("http://yahoo.com");
	}
}
