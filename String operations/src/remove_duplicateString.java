import java.util.HashSet;
import java.util.LinkedHashSet;

public class remove_duplicateString {

	public static void main(String[] args) {
		// using linked hash set
        String str="Mallika";
        
        HashSet<Character> set=new LinkedHashSet<>();
        for(int i=0; i<str.length();i++)
        set.add(str.charAt(i));
        
        for(Character ch: set)
        	System.out.println(ch);
        
	}
	
	
	// using for loop

}
