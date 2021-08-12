package Runner;

import org.testng.annotations.Test;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/cars.feature",
glue= {"BuyingCar"},
plugin= {"html:target/cucumber-reports.html"}
)
@Test
public class MyRunner extends AbstractTestNGCucumberTests{

}
