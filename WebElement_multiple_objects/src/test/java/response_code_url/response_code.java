package response_code_url;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class response_code {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\\\SeleniumPractice\\\\Drivers\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		String url="https://edition.cnn.com/world";
		
		int resp_code=0;
		try {
			resp_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println("Response codeof URL" +resp_code);
		} 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
