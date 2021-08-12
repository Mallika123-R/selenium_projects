package CssSelector_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class specific_area {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\\\SeleniumPractice\\\\Drivers\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%2Fmerchandising&iid=M_46984515-88f5-46ef-a686-dc2f2a0aca3c_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&cid=IF56C41VGEYS");
		List<WebElement> Tshirts_name=driver.findElements(By.xpath("//div[@class='_2WkVRV']"));
		System.out.println("Total T-Shirts" +Tshirts_name.size());
		
		for(WebElement e: Tshirts_name)
		{
			System.out.println(e.getText()); 
		}
		List<WebElement> Tshirts_prize=driver.findElements(By.cssSelector("div._25b18c"));
		System.out.println("Total T-Shirts" +Tshirts_prize.size());
		
		for(WebElement e: Tshirts_prize)
		{
			System.out.println(e.getText());
		}
		
		for(int i=0; i<Tshirts_name.size(); i++)
		{
			System.out.println(i+"--"+Tshirts_name.get(i).getText()+"---"+Tshirts_prize.get(i).getText());
		}
		
	}
	

}
