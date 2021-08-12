package zoho.pages;

import zoho.managers.WebDriverManager;

public class LoginPage {
	
	WebDriverManager webdriver;
	public LoginPage(WebDriverManager webdriver)
	{
		this.webdriver=webdriver;
	}
	public void doLogin()
	{
		//login on site
		
				//success- module selection page
				//not success - same login page
		webdriver.log("trying to login into Zoho");
		webdriver.type("username_id",webdriver.getProperty("userid"));
		webdriver.click("nxtbutton_xpath");
		webdriver.type("password", webdriver.getProperty("password"));
		
	}

}
