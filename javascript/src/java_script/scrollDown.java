package java_script;

import org.testng.annotations.Test;

@Test
public class scrollDown {

  
    public void ByPixel() {
    	System.setProperty("webdriver.edge.driver","D:\\SeleniumPractice\\Drivers\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        ((WebDriver) driver).get("http://demo.guru99.com/test/guru99home");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
        ((WebDriver) driver).manage().window().maximize();

        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
    }
}