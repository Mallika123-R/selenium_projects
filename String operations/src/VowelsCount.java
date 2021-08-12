
public class VowelsCount {
  
	  public static int vowel(String s)
	  {   
		  int c,i;
		  for(i=0,c=0; i<s.length();i++)
		  {
			  char ch=s.charAt(i);
			  if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
				  c++;
			    
			  
		  }
		  return c;
	  }
	public static void main(String[] args) {
		System.out.println("My name is mallika");
		int res=vowel("My name is mallika");
		System.out.println("Total no. of vowels are: "+res);

	}

}
