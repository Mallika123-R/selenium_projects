import java.util.HashMap;
import java.util.LinkedHashMap;

public class count_char {

	public static void main(String[] args) {
		String str="Mallika";
		
		//char ch[]=str.toCharArray();
		HashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++)
		{
			Character c=str.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
     System.out.println(map);
	}

}
