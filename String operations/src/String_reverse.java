

import java.util.Scanner;

public class String_reverse {
	

	public static void main(String[] args)
	{
		
	  String str="Mallika";
	 // String rev="";
	  char[] c=str.toCharArray();
	  
	  for(int i=str.length(); i>0; --i)
	  {
		  System.out.print(c[i-1]);
	  }
	  
	  
	/*{
	   String_reverse rev=new String_reverse();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String--");
		String str=sc.nextLine();
		System.out.println("Reverse a string is---"+rev.reverse(str));

	}
 
	 
	/*public static void main(String[] args)
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
		}*/
	  
	  
	  
	}
	 
}
