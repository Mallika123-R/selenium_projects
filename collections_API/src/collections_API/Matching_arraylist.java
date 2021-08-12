package collections_API;

import java.util.ArrayList;
import java.util.List;

public class Matching_arraylist {

	public static void main(String[] args) {
		List<String> value=new ArrayList<String>();
		value.add("Rahil");
		value.add("Rahul");
		value.add("Ram");
		value.add("Ramesh");
		value.add("Mallika");
		value.add("Miley");
		value.add("Mehak");
		//List<String> listclone=new ArrayList<String>();
		for(String s: value)
		{
			if(s.startsWith("M"))
			{
				System.out.println(s);
			}
			
			else if(s.matches("(Ra.*)"))
			{
				System.out.println(s);
			}
						
		}
		
		

	}

}
