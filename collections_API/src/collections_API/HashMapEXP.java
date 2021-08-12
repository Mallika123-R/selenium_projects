package collections_API;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEXP {

	public static void main(String[] args)
	{
	/*Map<String, String> m=new HashMap<String,String>();
	m.put("Name", "Mallika");
	m.put("Qualification", "Master");
	m.put("Place", "Jalandhar");
	
//System.out.println(m.get("Place"));

     for(Map.Entry<String, String> e: m.entrySet())
     {
    	System.out.println(e.getKey()+" "+e.getValue()); 
     }*/
		HashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		map.put("Mallika",1);
		map.put("Mehak",2);
		map.put("Mohit", 3);
	
		Iterator itr=map.entrySet().iterator();
		System.out.println("----using while loop---");
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		System.out.println("----using for loop---");
		for(Map.Entry m: map.entrySet())
		{
			
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}
	
}
