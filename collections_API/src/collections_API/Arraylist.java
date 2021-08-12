package collections_API;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String> L=new ArrayList<String>();
		System.out.println(L.size());
		L.add("Apple");
		L.add("Fruits");
		L.add("Orange");
		//L.add(2);
		System.out.println("output--->"+L.get(1));
		System.out.println("------");
		
		Iterator it=L.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--using for loop----");
		for(int i=0; i<L.size(); i++)
		{
			System.out.println("second output-->"+L.get(i));
		}
		System.out.println("--using Advance for loop----");
		for(String S : L)
		{
          System.out.println("third output-->"+S);
	}
		
		
		System.out.println("_______________");
		List list=new ArrayList();
		list.add("hello");
		list.add(2);
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Integer);
		
		System.out.println("---Boolean-----");
		List<Boolean> li=new ArrayList();
		li.add(true);
		li.add(Boolean.parseBoolean("abc"));
		li.add(Boolean.TRUE);
		
		System.out.println(li.size());
		System.out.println(li.get(1) instanceof Boolean);
	  
		System.out.println("---while loop--");
		Iterator itr= li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

}
}
