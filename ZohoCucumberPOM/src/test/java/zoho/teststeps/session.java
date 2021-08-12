package zoho.teststeps;

import io.cucumber.java.en.Given;
import zoho.context.TestContext;
import zoho.pages.HomePage;
import zoho.pages.LoginPage;

public class session {
	public TestContext context;
	public HomePage homepage;
	public LoginPage loginpage;
	 
	public session(TestContext context)
	{  context.log("session constructor");
		this.context=context;
		this.homepage=this.context.getpageObjectManager().getHomePage();// return pageobjectmanager
	    this.loginpage=this.context.getpageObjectManager().getLoginPage();
	}
	
    @Given("I am logged in zoho.com")
    public void zohoLogin()
    {
    	context.log("I am logged in zoho.com");
    	homepage.load("Edge");
    	homepage.gotoLoginPage();
    	loginpage.doLogin();
    	
    	
    	//login
    	//properties file access
    	//homepage,loginPage
    	//webdriver
    	
    }
}
