import org.json.simple.JSONObject;

public class JSON_example {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject std1= new JSONObject();
		JSONObject std2= new JSONObject();
		std1.put("name", "Rahil");
		std2.put("name", "Milly");
		
		System.out.println(std1.toJSONString());
		System.out.println(std2.toJSONString());
		
		
	}

}
