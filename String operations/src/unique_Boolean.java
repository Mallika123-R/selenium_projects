import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class unique_Boolean {

	public static void main(String[] args) {
	
		boolean result=false;
		String str="IcanLivee";
		System.out.println(str);
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0; i<str.length(); i++)
		{
			result=set.add(str.charAt(i));
			if(result==false)
				break;
		}
	        System.out.println(result);

		
	}

}
