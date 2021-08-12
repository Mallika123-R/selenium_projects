import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reading_JSON {

	
	public static void main(String[] args) throws IOException, ParseException {
		String path=System.getProperty("user.dir")+"//test.json";
		FileReader reading=new FileReader(path);
		
		JSONParser value=new JSONParser();
		JSONObject file=(JSONObject)value.parse(reading);
		System.out.println(file.toJSONString());
		
		/*JSONArray arr=(JSONArray)file.get("Testname");
		System.out.println(arr.toJSONString());
		
		arr.get(0);
		
		JSONObject testdetails=(JSONObject)arr.get(1);
		System.out.println(testdetails.toJSONString());*/
		
		JSONArray testdetails=(JSONArray)file.get("Testname");
		
		for(int i=0; i<testdetails.size(); i++)
		{
			JSONObject details=(JSONObject)testdetails.get(i);
			
		}
		
		

	}

}
