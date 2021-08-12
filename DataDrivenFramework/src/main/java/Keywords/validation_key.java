package Keywords;

import org.openqa.selenium.support.ui.Select;

public class validation_key extends Generic_Key {

	public void validateTitle()
	{
		
	}
	public void validateText()
	{
		
	}
	public void validateElementPresent(String locator)
	{
		boolean result=isElementPresent(locator);
		reportfail("Element is not found"+locator,true);
	}
	public void validateSelectValueIn_DropDown(String locatorKey, String Option)
	{
	  Select s=new Select(getElement(locatorKey));
	  String text=s.getFirstSelectedOption().getText();
	  if(text.equals(Option))
	  {
		  reportfail("Options-->"+Option+"-present in drop down list"+locatorKey,true);  
	  }
	}
	public void validateSelectValueNotIn_DropDown(String locatorKey, String Option)
	{
	  Select s=new Select(getElement(locatorKey));
	  String text=s.getFirstSelectedOption().getText();
	  if(!text.equals(Option))
	  {
		  reportfail("Options-->"+Option+"-not present in drop down list"+locatorKey,true);  
	  }
	}
	
	
}
