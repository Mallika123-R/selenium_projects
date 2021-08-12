package com.stepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class LoginPage extends BaseClass {
	
@Given("User launch the Browser and the URL")
public void user_launch_the_browser_and_the_url() {
	BaseClass.launchBrowser("Edge");
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}

@Given("User Enter the user name")
public void user_enter_the_user_name() {
	FileReaderManager.getInstance().Locators().UserName.sendKeys("9600349993");
   //driver.findElement((By) FileReaderManager.getInstance().getConfigReader().UserName).sendKeys("9600349993");
}
@When("User Enter the password")
public void user_enter_the_password() {
   
  FileReaderManager.getInstance().Locators().Password.sendKeys("Dummypassword");
}
@When("User click the login button")
public void user_click_the_login_button() {
   FileReaderManager.getInstance().Locators().LoginButton.click();
   driver.close();
}





}
