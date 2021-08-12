package zoho.context;

import java.io.IOException;

import zoho.managers.WebDriverManager;
import zoho.pages.CreateLeadPage;
import zoho.pages.HomePage;
import zoho.pages.LeadDescription;
import zoho.pages.LeadsDetailPage;
import zoho.pages.LoginPage;
import zoho.pages.TopMenuComponent;

public class PageObjectManager {
	HomePage homepage;
	LoginPage loginPage;
	TopMenuComponent topMenu;
	LeadsDetailPage leadsDetailPage;
	LeadDescription leadDescriptionPage;
	CreateLeadPage createLeadPage;
	
	WebDriverManager webdriver;
	
	public PageObjectManager() throws IOException
	{
		this.webdriver=new WebDriverManager();
	}
	
	
	public WebDriverManager getWebDriverManager() {
		
		return webdriver;
	}
	public HomePage getHomePage()
	{
		if(homepage==null)
		{
			homepage=new HomePage(webdriver);
			
		}
		return homepage;
	}
	public LoginPage getLoginPage()
	{
		if(loginPage==null)
		loginPage=new LoginPage(webdriver);
		
		return loginPage;
	}
	public TopMenuComponent getTopMenu()
	{
		if(topMenu==null)
			topMenu=new TopMenuComponent(webdriver);	
		return topMenu;
	}
	
	public LeadsDetailPage getLeadDetailPage()
	{
		if(leadsDetailPage==null)
			leadsDetailPage=new LeadsDetailPage(webdriver);
			
		return leadsDetailPage;
	}
	public LeadDescription getLeadDescriptionPage()
	{
		if(leadDescriptionPage==null)
			leadDescriptionPage=new LeadDescription(webdriver);
			
		return leadDescriptionPage;
	}
	public CreateLeadPage getCreateDetailPage()
	{
		if(createLeadPage==null)
			createLeadPage=new CreateLeadPage(webdriver);
			
		return createLeadPage;
	}


	
	
	
	

}
