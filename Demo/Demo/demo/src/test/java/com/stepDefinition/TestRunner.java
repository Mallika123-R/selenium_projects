package com.stepDefinition; 
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/Feature"
 ,glue={"com.stepDefinition"},monochrome = true,dryRun = false,tags ="@Regression",plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber-html-report.html","json:target/cucumber.json","junit:target/cucmber.xml"}
)
 
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	@DataProvider(parallel = false)
	 @Override
	 public Object[][] scenarios() {
	 return super.scenarios();
	 } 
}