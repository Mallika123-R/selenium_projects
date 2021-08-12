package zoho.pages;

import zoho.managers.WebDriverManager;

public class LeadsDetailPage {

WebDriverManager webdriver;
	
	public LeadsDetailPage(WebDriverManager webdriver)
	{
		this.webdriver=webdriver;
	}
	public void goToCreateLeadPage()
	{
		 webdriver.click("creatleadbutton_xpath");
		if(!webdriver.isElementPresent("lead_first_name_id"))
		{
			webdriver.logFailure("Creat lead page did not open", true);
		}
	}
	public void selectLead(String leadName) {
		int rowNum=webdriver.getLeadRowNumberWithCellData(leadName);
		if(rowNum==-1)
		webdriver.logFailure("lead found in lead list", true);
		webdriver.log(leadName +" lead row no is " +rowNum);
		//xpath of webtable dynamically
		
		webdriver.selectLeadCheckBox(rowNum);
		
	}
	public void validateLeadPresent(String leadName)
	{
		int rowNum=webdriver.getLeadRowNumberWithCellData(leadName);
		if(rowNum==-1)
			webdriver.logFailure("lead not found in lead list", true);
	}
	public void validateLeadNotPresent(String leadName)
	{
		int rowNum=webdriver.getLeadRowNumberWithCellData(leadName);
		if(rowNum!=-1)
			webdriver.logFailure("lead found in lead list", true);
	}

}
