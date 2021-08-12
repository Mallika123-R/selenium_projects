package testcase.radiff;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import Basetest.basetestcase;
import Keywords.Application_key;

public class session extends basetestcase {
	
	@Test
	public void dologin(ITestContext context) throws IOException
	{
		//Application_key app=new Application_key();
		app.log("---login-----");
		app.OpenBrowser("Edge");
		app.navigate("url");
		app.type("username_id","wadhwa12miley@gmail.com");
		//app.reportfail("Test is incorrect");
		//app.reportfail("First fail--non critical",false);
		app.type("password_id", "1Mallika1#");
		app.log("successful");
		app.click("loginsubmit_id");
		app.log("done");
		
	}
	public void logout()
	{
		app.log("---logout-----");
	}

}
