package collections_API;
import java.util.*;  

public class LinkedListExp {
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("kishan");  
		al.add("Ajay");  
		al.add("");
		al.add("");
		al.add("");
		al.add("");
		
		
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());
}
	}
}
