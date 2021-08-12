import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class non_repeatedString {

	public static void main(String[] args) {
		 String str="Mallika";
		 
		 Map<Character, Integer> charmap=new LinkedHashMap<Character,Integer>();
		 for(int i=0; i<str.length(); i++)
		 {
			 Character c=str.charAt(i);
			 if(charmap.containsKey(c))
			 {
				 charmap.put(c, charmap.get(c)+1);
			 }
			 else {
				 charmap.put(c, 1);
				 
			 }
		 }
		 for(Entry<Character, Integer> e:charmap.entrySet())
		 {
			 if(e.getValue()==1)
			 {
				 System.out.println(e.getKey());
			 }
		 }
		 
		
	}

}


