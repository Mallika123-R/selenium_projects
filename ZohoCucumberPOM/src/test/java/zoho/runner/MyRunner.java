package zoho.runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
features="src/test/resources/zoho",
glue= {"zoho.teststeps"},
plugin= {"html:target/cucumber-reports.html"},
tags="@Leads"
)
@Test
public class MyRunner extends AbstractTestNGCucumberTests{
@Override
@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
//Grid
}
