package extract_all_links_list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class all_links {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\\\SeleniumPractice\\\\Drivers\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://edition.cnn.com");
		List<WebElement> all_links=driver.findElements(By.xpath("//a"));
		System.out.println("Total links on page\n"+all_links.size());
		WebElement fifthLink=all_links.get(5);
		System.out.println("name of the link-->");
		System.out.println(fifthLink.getAttribute("href"));
		//fifthLink.click();
		
		//print all links
		for(int i=0; i<all_links.size(); i++)
		{
			WebElement l=all_links.get(i);
			System.out.println(i+"--"+l.getText()+"--"+l.isDisplayed());
		}
		
		

	}

}
