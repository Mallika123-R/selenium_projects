package com.stepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobjects extends BaseClass {

	public Pageobjects() {
		PageFactory.initElements(driver, this);
	}

	//Locator for the userName Login
	@FindBy(id = "email")
	WebElement UserName;

	public WebElement getUserName() {
		return UserName;
	}

	//Locator for the Password Login
	@FindBy(id = "pass")
	WebElement Password;

	public WebElement getPassword() {
		return Password;
	}

	//Locator for the  Submit Method

	@FindBy(xpath = "//button[@name ='login']")
	WebElement LoginButton;

	public WebElement getLoginButton() {
		return LoginButton;
	}

}
