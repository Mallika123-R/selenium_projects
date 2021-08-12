package Project_script;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Ndtv extends BaseeTest{

	@Test
	public void RentProperty() throws InterruptedException
	
	{   
		app.click("subMenu_css");
		app.link();
		app.type("search_xpath","searchData");
		//app.waitForPageToLoad();
		app.click("mapClick_id");
		app.checkbox("checkbox_css","searchData");
		app.TempCity("tempContainer_css","searchData");
		//String name="Jalandhar"
		
		
	}
	
	
}
