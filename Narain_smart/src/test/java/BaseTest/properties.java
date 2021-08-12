package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class properties {
	
	Properties prop;
	
	@Test
	public void file_property() throws FileNotFoundException
	{
	
		prop=new Properties();
		String path;
		try {
			path = System.getProperty("user.dir")+"//prod.properties";
			FileInputStream fs=new FileInputStream(path);
			prop.load(fs);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("url"));
		
		
		
	}

}
