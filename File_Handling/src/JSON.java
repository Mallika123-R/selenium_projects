import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON {
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args)
	{
		
		JSONObject std1=new JSONObject();
		std1.put("name", "Mallika");
		std1.put("Place", "Patiala");
		std1.put("DOB", "12 OCT 1993");
		
		JSONObject std2=new JSONObject();
		std2.put("name", "Rahil");
		std2.put("Place", "Jalandhar");
		std2.put("DOB", "23 Feb 1992");
		
	
		JSONArray details=new JSONArray();
		details.add(std1);
		details.add(std2);
		//System.out.println(details.toJSONString());
		
		// for start with JSON Key
		JSONObject StudentDetails=new JSONObject();
		StudentDetails.put("Studentdetails", details);
		System.out.println(StudentDetails.toJSONString());
	}

}
