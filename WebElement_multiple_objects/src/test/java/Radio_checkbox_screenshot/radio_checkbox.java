package Radio_checkbox_screenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class radio_checkbox {
	@Test
	public void radio_manage() {
		System.setProperty("webdriver.edge.driver","D:\\\\SeleniumPractice\\\\Drivers\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.chabadpotomac.com/templates/articlecco_cdo/aid/4923760/jewish/Register-Online.htm");
		List<WebElement> radio= driver.findElements(By.name("q10_payment[payment_method]"));
		System.out.println("Total no. of radio " + radio.size());
		System.out.println(radio.get(0).getAttribute("value"));
		System.out.println(radio.get(1).getAttribute("value"));
		System.out.println(radio.get(2).getAttribute("value"));
		radio.get(0).click();
		System.out.println(radio.get(0).getAttribute("value") + "is selected ");
		
		//checkbox
		List<WebElement> checkbox= driver.findElements(By.name("q8_input8[]"));
		System.out.println("Total no. of checkbox " + checkbox.size());
		System.out.println(checkbox.get(0).getAttribute("value"));
		System.out.println(checkbox.get(1).getAttribute("value"));
		System.out.println(checkbox.get(2).getAttribute("value"));
		System.out.println(checkbox.get(3).getAttribute("value"));
		System.out.println(checkbox.get(4).getAttribute("value"));
		System.out.println(checkbox.get(5).getAttribute("value"));
		System.out.println(checkbox.get(6).getAttribute("value"));
		System.out.println(checkbox.get(7).getAttribute("value"));
		System.out.println(checkbox.get(8).getAttribute("value"));
		System.out.println(checkbox.get(9).getAttribute("value"));
		//System.out.println(checkbox.get(10).getAttribute("value"));
		checkbox.get(3).click();
		System.out.println(checkbox.get(3).getAttribute("value") + "is selected "+checkbox.get(3).getAttribute("checked"));
     }
	
}
