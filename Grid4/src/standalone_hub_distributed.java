import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class standalone_hub_distributed {

	public static void main(String[] args) throws MalformedURLException {
		//String grid="http://localhost:4444/";
		WebDriver driver=null;
		EdgeOptions fire=new EdgeOptions();
		//FirefoxOptions fire=new FirefoxOptions();
		driver=new RemoteWebDriver(new URL("http://localhost:4444/"),fire);
		driver.get("http://yahoo.com");
		driver.quit();
	}

}
