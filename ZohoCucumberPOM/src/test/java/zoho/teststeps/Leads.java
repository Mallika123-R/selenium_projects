package zoho.teststeps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import zoho.context.TestContext;
import zoho.pages.CreateLeadPage;
import zoho.pages.LeadDescription;
import zoho.pages.LeadsDetailPage;
import zoho.teststeps.data.LeadData;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Leads {
	
	public TestContext context;
	public LeadsDetailPage leadDetailPage;
	public CreateLeadPage createLeadPage;
	public LeadDescription leadDescriptionPage;
	 
	public Leads(TestContext context)
	{ 
		System.out.println("Leads constructor");
		this.context=context;
		this.leadDetailPage=context.getpageObjectManager().getLeadDetailPage();
		this.leadDescriptionPage=context.getpageObjectManager().getLeadDescriptionPage();
		this.createLeadPage=context.getpageObjectManager().getCreateDetailPage();
	}
	
	@Before
	public void before(Scenario scenario)
	{
		
		context.createScenario(scenario.getName());
		context.log("starting scenario" +scenario.getName());
	}
	@After
	public void after(Scenario scenario)
	{
		context.log("Ending scenario" +scenario.getName());
		context.endScenario();
		context.getpageObjectManager().getWebDriverManager().quit();
		System.out.println("--------------------------");
	}

   
	@When("I go to cretae lead page")
	public void goToCreateLead()
	{
		leadDetailPage.goToCreateLeadPage();
	}
	@And("enter and sumbit lead details")
	
	public void submitDetails(List<LeadData>  leadData)
	{
		context.log("enter and submit lead details" +leadData.size());
		context.log("enter and submit lead details" +leadData.get(0).firstName);
		createLeadPage.submitLeadDetails(leadData);
	}
	
	@DataTableType
	public LeadData entry(Map<String, String> entry)
	{
		System.out.println(entry.toString());
		return new LeadData(entry.get("FirstName"),entry.get("LastName"),
				entry.get("Email"),entry.get("Company"));
	}
	
	@Then("Lead Detail Description Page should load")
	public void verifyLeadDetailPage()
	{
		leadDescriptionPage.hasLoaded();
	}
	
	@And("I verify lead details")
	public void verifyLeadDetails()
	{
		context.log("I verify lead details");
		//
	}
	@Then("Lead {string}  should {string} inside the grid")
	public void verifyLeadCreation(String leadName, String condition)
	{
		//context.log("Lead should be present inside the grid");
		if(condition.equals("be present"))
			leadDetailPage.validateLeadPresent(leadName);
		
		else
			leadDetailPage.validateLeadNotPresent(leadName);
			
	}
	
	@When("I select the Lead {string}")
	public void selectLead(String leadName)
	{
		context.log("selecting the lead "+leadName);
		leadDetailPage.selectLead(leadName);
	}
	
	@And("I click on delete button")
	public void deleteLead()
	{
		
	}
	
	
	
}
