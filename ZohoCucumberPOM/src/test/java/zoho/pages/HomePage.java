package zoho.pages;

import com.aventstack.extentreports.ExtentTest;

import zoho.managers.WebDriverManager;

public class HomePage {
	WebDriverManager webdriver;
	//ExtentTest test;
	public HomePage(WebDriverManager webdriver)
	{
		this.webdriver=webdriver;
	}
	public void load(String browser) //open browser and navigate it to home page
	{
		webdriver.log("trying to load home page after launching browaser");
		webdriver.openBrowser(browser);
		webdriver.navigate("url");
		if(webdriver.verifyTitle("homepagetitle"))
			webdriver.logFailure("Title did not match",false);
		webdriver.logFailure("Some critical failure",true);
		
		//verify if the home page is loaded
	}
	
	public void gotoLoginPage()
	{
		//webdriver code toclick on the signIn link
		 //verify if login page hasloaded
		webdriver.log("trying to load login page");
		webdriver.click("signing_link_css");
		if(!webdriver.isElementPresent("username_id"))
			webdriver.logFailure("login Page didi not lead", true);
		
		 
	}

}
