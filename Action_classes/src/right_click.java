import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class right_click {
    static WebDriver driver;
    @Test
 public void click() {
    //Note: Following statement is required since Selenium 3.0, 
    //optional till Selenium 2.0
    //Set system properties for geckodriver 
	 System.setProperty("webdriver.gecko.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
		
 
    // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
 
    // Launch the URL 
    driver.get("https://demoqa.com/buttons");
    System.out.println("demoqa webpage displayed");
 
    //Maximise browser window
    driver.manage().window().maximize();
 
    //Instantiate Action Class
    Actions actions = new Actions(driver);
 
    //Retrieve WebElement to perform right click
    WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
 
    //Right Click the button to display Context Menu&nbsp;
    
    System.out.println("Right click Context Menu displayed");
 
    //Following code is to select item from context menu which gets open up on right click, this differs 
    //depending upon your application specific test case: 
    //Select and click 'Copy me' i.e. 2nd option in Context menu 
    WebElement elementOpen = driver.findElement(By.xpath("//div[@id='rightclickItem']/div[1]"));  
    elementOpen.click(); 
 
    // Accept the Alert 
    driver.switchTo().alert().accept();
    System.out.println("Right click Alert Accepted");
 
    // Close the main window 
    //driver.close();
    
   }
   
 }
