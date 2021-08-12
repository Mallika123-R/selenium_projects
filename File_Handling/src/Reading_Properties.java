import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reading_Properties {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		String Path="D:\\SeleniumPractice\\File_Handling\\project.properties";
		FileInputStream fs= new FileInputStream(Path);
		p.load(fs);
		System.out.println(p.getProperty("username"));
		

	}

}
