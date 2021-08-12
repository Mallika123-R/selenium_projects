package testcase.radiff;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Basetest.basetestcase;

public class portfolio_mgmt extends basetestcase {

	@Test
	public void create_portfolio(ITestContext context) throws InterruptedException
	{
		String portfolio_name="Mallika124";
		app.log("---create Portfolio-----");
		app.click("create_portfolio_css");
		app.clear("clear_createPortfolio_id");
		app.type("clear_createPortfolio_id", portfolio_name);
		app.click("portfolio_button_id");
		//app.waitForPageToLoad();
		app.log("---portfolio add successfully----");
		app.validateSelectValueIn_DropDown("portfolio_dropDown_css",portfolio_name);
		//test.log(Status.INFO, "create portfolio");
		//app.reportfail("First fail-critical",false);
		//app.navigate("url");
		//app.assertall();
		
	}
	@Test
	public void Delete_portfolio() throws InterruptedException
	{
		String portfolio_name="hi";
		app.log("---delete-----");
		app.SelectFromVisibleText("portfolio_dropDown_css", portfolio_name);
		app.waitForPageToLoad();
		app.click("deletePortfolio_id");
		//app.acceptALert();
		app.validateSelectValueNotIn_DropDown("portfolio_dropDown_css",portfolio_name);
		
		
	}
	@Test
	public void select_portfolio() throws InterruptedException
	{
		//app.defaultLogin();
		System.out.println("select portfolio");
		app.log("---Select portfolio-----");
		app.click("portfolio_dropDown_css");
		app.SelectFromVisibleText("portfolio_dropDown_css", "Mallika15");
		app.log("portfolio is selected");
		//app.waitForPageToLoad();
	}
}
