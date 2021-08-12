package zoho.teststeps;

import io.cucumber.java.en.When;
import zoho.context.TestContext;
import zoho.pages.TopMenuComponent;

public class TopMenu {
	
	public TestContext context;
	public TopMenuComponent topMenu;
	 
	public TopMenu(TestContext context)
	{  context.log("TopMenu constructor");
		this.context=context;
		this.topMenu=context.getpageObjectManager().getTopMenu();
	}
	@When("I click on {string} in top menu")
	public void loadPage(String menuOption)
	{
		context.log("I click on "+menuOption+" in top menu");
		topMenu.load(menuOption);
		
	}

}
