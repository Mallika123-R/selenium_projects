package zoho.pages;

import zoho.managers.WebDriverManager;

public class TopMenuComponent {
	
	WebDriverManager webdriver;
	public TopMenuComponent(WebDriverManager webdriver) {
		this.webdriver=webdriver;
	}
	
	public void load(String menuOption)
	{
		if(menuOption.equals("Leads"))
			webdriver.click("leads_xpath");
		
		else if(menuOption.equals("Contacts"))
		{
			
		}
	}
	

}
