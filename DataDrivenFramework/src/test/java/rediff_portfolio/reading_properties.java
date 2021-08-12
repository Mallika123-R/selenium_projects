package rediff_portfolio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class reading_properties {

	public static void main(String[] args) throws IOException {
		String path=System.getProperty("user.dir")+"//src//test//resources//prod.properties";
        Properties prop=new Properties();
        FileInputStream fs=new FileInputStream(path);
        prop.load(fs);
        
       // System.out.println(prop.getProperty(url));
	}

}
