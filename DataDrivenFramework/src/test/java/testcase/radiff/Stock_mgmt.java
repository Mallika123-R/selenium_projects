package testcase.radiff;

import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Basetest.basetestcase;

public class Stock_mgmt extends basetestcase{

	@Test
	public void add_FreshStock() throws InterruptedException
	{
		app.log("---add stock-----");
		String company_name="Britannia Industries Ltd";
		String selectDate="6-05-2021";
		String stockQuality="100";
		String stockPrice="200";
		
		app.log("Adding" +stockQuality+"Stock of "+company_name);
		app.click("addStock_xpath");
		app.type("stockName_xpath",company_name );
		//app.wait(1);
		app.clickEnterButton("stockName_xpath");
		app.click("calander_id");
		app.select_date(selectDate);
		app.type("stock_quality_xpath",stockQuality);
		app.type("stock_price_xpath", stockPrice);
		app.click("stock_Addbutton_xpath");
		//app.waitForPageToLoad();
		app.log("---add stock successfully---");
		
		
		
		
	}
	@Parameters({"action"})
	@Test
	/*public void Modify_stock(ITestContext con, String action) throws InterruptedException
	{
		app.log("---modify----");
		String company_name="Britannia Industries Ltd.";
		String select_date="05-05-2021";
		String stockQuantity="100";
		String stockPrice="200";
		
		app.log("selling" +stockQuantity+ "of company "+company_name);
		int quantityBeforeModification=app.findCurrentStockQuantity(company_name);
		con.setAttribute("quantityBeforeModification", quantityBeforeModification);
		
		app.goToBuySell(company_name);
		if(action.equals("sellsStock"))
			app.SelectFromVisibleText("BuySell_css","Sell");
		
		else
			app.SelectFromVisibleText("BuySell_css","Buy");
		
		app.click("BuySellCalander_id");
		app.log("Selecting Date--"+select_date);
		app.select_date(select_date);
		app.type("BuySell_quantity_css", stockQuantity);
		app.type("BuySell_price_css", stockPrice);
		app.click("BuySell_button_id");
		app.waitForPageToLoad();
		app.log("stock sold");
		
			
		
		
		
	}*/
	
	public void verify_stockPresent()
	{
		app.log("---verify stock-----");
		String company_name="Britannia Industries Ltd.";
		int row=app.getRowNumwithCellData("stockTable_css", company_name);
	    if(row==-1)
	    	app.reportfail("stock is not present"+company_name,true);
	    app.log("stock found in list"+company_name);
	}
	@Parameters({"action"})
	@Test
	public void verifyStock_quantity(ITestContext con, String action)
	{
		app.log("---verify quantity-----");
		String company_name="Britannia Industries Ltd.";
		String select_date="21-05-2021";
		String stockQuantity="100";
		String stockPrice="200";
		
		app.log("Verify stock quantity after action-->"+ action);
		//quantity after add/selling stocks
		
		int quantityAfterModification=app.findCurrentStockQuantity(company_name);
		int modifyQuantity=Integer.parseInt(stockQuantity);
		int expectedModifiedQunatity=0;
		
		//quantity before adding/selling stocks
		int qunatityBeforeModification=(Integer)con.getAttribute("qunatityBeforeModification");
		if(action.equals("addStock"))
		expectedModifiedQunatity=quantityAfterModification-qunatityBeforeModification;
		
		else if(action.equals("sellStock"))
			expectedModifiedQunatity=qunatityBeforeModification-quantityAfterModification;
		
		app.log("old stock quantity--"+qunatityBeforeModification );
		app.log("After stock quantity--"+quantityAfterModification );
		
		if(modifyQuantity!=expectedModifiedQunatity)
			app.reportfail("quantity did not match", true);
		
		app.log("stock quantity changed as per expected-->"+modifyQuantity);
		
		
		
	}
	@Parameters({"action"})
	@Test
	public void verifyTransactionHistory(String action)
	{
		app.log("---verify Transaction-----");
		String company_name="Britannia Industries Ltd.";
		String select_date="05-05-2021";
		String stockQuantity="100";
		String stockPrice="200";
				
				app.log("Verify transaction History for-->"+ action+"for Quantity" +stockQuantity);
				app.GotoTransactionHistory(company_name);
				
				String ChangedQuantityDisplayed=app.getElement("LatestChangedSharedQuantity_xpath").getText();
				app.log("got Changed quantity"+ChangedQuantityDisplayed);
				
				if(action.equals("sellsStock"))
					stockQuantity="-"+stockQuantity;
				
				if(!ChangedQuantityDisplayed.equals(stockQuantity))
					app.reportfail("got changed transaction history as" +ChangedQuantityDisplayed,true);
				
				app.log("Transaction History is OK");
					
		
	}
}
