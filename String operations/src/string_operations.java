import javax.print.DocFlavor.STRING;

public class string_operations {

	public static void main(String[] args) {
		
		// string equal is used for comparing the strings
		String str1="My name is Milly Arora";
		String str2="My name is Rahil Arora";
		String str3="My name is Milly Arora";
		
		if(str1.equals(str2))
		{
			System.out.println("both are not equal");
		}
		else if(str1.equals(str3))
		{
			System.out.println("Both are equal");
		}
		else if(str2.equals(str1))
		{
           System.out.println("not equal");
		}
		else
		{
			System.out.println("equal");
		}
		
		
		// String length- how many character in string
		
		int a = str1.length();
		   System.out.println(a);
		   
		   // substring is used for cut the string
		   
		   str3= str3.substring(11,17);
		   System.out.println(str3);
		   
		   //indexof is find the character position
		   
		   int i= str1.indexOf(" ");
		   System.out.println(i);
		   
		   int b= str1.indexOf("name");
		   System.out.println(b);
		   
		   //replace and replaceall is used for replace word
		   
		   str1 = str1.replace("Milly", "Mallika");
		   System.out.println(str1);
		   
		
		   str2=str2.replaceAll(" ", "_");
		   System.out.println(str2);
		   
		   if(str1.indexOf("Mallika")!=-1)
		   {
			   String s= str1.replace("Milly", "Mallika");
			   System.out.println(s);
		   }
		   
		   System.out.println(str1.charAt(6));
		   
		   // trin is used for no return blank space
		   
		   String S1= "    Hello   ";
		   System.out.println(S1.trim());
		   
		   String x= "UserName";
		   String y= "username";
		   System.out.println(x.equals(y));
		   System.out.println(x.equalsIgnoreCase(y));
		   
	}
	
	
	

}
