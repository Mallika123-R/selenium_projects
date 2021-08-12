package window_mngmt;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class popup extends Testbase{
	@Test
	public void window_mgmt() {
		//WebDriver driver=new EdgeDriver();
		//System.getProperty("webDriver.Edge.driver","D:\\SeleniumPractice\\Drivers\\msedgedriver.exe");
		
		WebDriver driver=launchdriver("Edge");
		driver.get("https://www.naukri.com");
		Set<String> s=driver.getWindowHandles();
		System.out.println("Total window size " + s.size());
		
		Iterator<String> it=s.iterator();
		System.out.println(it.next());
		
		//it=s.iterator();
		//System.out.println(it.next());
		String mainwindow=it.next();
		String popup1=it.next();
		String popup2=it.next();
		//String popup3=it.next();
		
		System.out.println(mainwindow);
		System.out.println(popup1);
		System.out.println(popup2);
		//System.out.println(popup3);
		
		driver.switchTo().window(popup1);
		driver.close();
		
		driver.switchTo().window(popup2);
		driver.close();
		
		//driver.switchTo().window(popup3);
		//driver.close();
		
		driver.switchTo().window(mainwindow);
		driver.switchTo().defaultContent();
		
		
		
		
	}

}
