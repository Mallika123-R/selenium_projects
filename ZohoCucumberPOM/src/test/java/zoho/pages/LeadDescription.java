package zoho.pages;

import zoho.managers.WebDriverManager;

public class LeadDescription {
WebDriverManager webdriver;
	
	public LeadDescription(WebDriverManager webdriver)
	{
		this.webdriver=webdriver;
	}
	public void hasLoaded()
	{
		if(!webdriver.isElementPresent("last_name_id"))
		{
			webdriver.logFailure("Lead Description page has not loaded", true);
		}
	}

}
