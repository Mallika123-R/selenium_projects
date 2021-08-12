package rediff_portfolio;

import java.io.IOException;

import org.testng.annotations.Test;

import Keywords.Application_key;

public class create_portfolio {

	 @Test
	public void creatPort() throws IOException
	{
		Application_key app=new Application_key();
		app.OpenBrowser("Edge");
		app.navigate("url");
		app.type("username_id","wadhwa12miley@gmail.com");
		app.type("password_id", "1Mallika1#");
		app.click("loginsubmit_id");
		
	}
}
