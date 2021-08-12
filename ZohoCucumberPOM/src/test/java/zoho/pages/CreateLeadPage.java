package zoho.pages;

import java.util.List;

import zoho.managers.WebDriverManager;
import zoho.teststeps.data.LeadData;

public class CreateLeadPage {
	
	WebDriverManager webdriver;
	
	public CreateLeadPage(WebDriverManager webdriver)
	{
		this.webdriver=webdriver;
	}
	public void submitLeadDetails(List<LeadData> leadData)
	{ 
		webdriver.type("lead_first_name_id", leadData.get(0).firstName);
		webdriver.type("lead_last_name_id", leadData.get(0).lastName);
		webdriver.type("lead_company_id", leadData.get(0).company);
		webdriver.type("lead_email_id", leadData.get(0).email);
		webdriver.click("save_btn_id");
		
	}
	

}
