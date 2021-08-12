package reverse;

import java.util.Scanner;

public class String_reverse {
	

	/*public static void main(String[] args)
	{
	   String_reverse rev=new String_reverse();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String--");
		String str=sc.nextLine();
		System.out.println("Reverse a string is---"+rev.reverse(str));

	}
 
	 public String reverse(String s)
	 {
		 String rev="";
		 for(int j=s.length(); j>0; --j)
		 {
			 rev=rev+(s.charAt(j-1));
		 }
		 return rev;
	 }*/
	public static void main(String[] args)
	{
	 //using Array
	 String str;
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter String--");
	  str=sc.nextLine();
	  char ch[]=str.toCharArray();
	  System.out.println("Reverse a string----");
	 
	 int j=ch.length;
		for(int i=j;i>0;i--)
		{
		System.out.print(ch[i-1]); 
		}
	  
	  
	  
	}
	 
}
