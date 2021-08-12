package collections_API;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTable {
	public static void main(String[] args)
	{
		Hashtable<String,String> table= new Hashtable<String,String>();
		table.put("name", "Mallika");
		table.put("place", "Jalandhar");
		table.put("tool", "Selenium");
		System.out.println(table.get("place"));
		
		Set keys = table.keySet();
		Iterator i = keys.iterator();
		while (i.hasNext()) {
		   System.out.println(i.next());
		}
		 Collection getValues=table.values();
		 i=getValues.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		 
		
		
	}

}
