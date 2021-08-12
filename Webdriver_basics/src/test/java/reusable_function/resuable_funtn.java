package reusable_function;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class resuable_funtn extends Testbase{

	@Test
	public void reusable() {
		WebDriver driver=launchdriver("Mozilla");
		driver.get("http://yahoo.com");
	}
}
