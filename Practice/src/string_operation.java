
public class string_operation {

	public static void main(String[] args) {
		
		String str1="hello Rahil";
		String str2="How are you";
		String str3="Hello Rahil";
		String str4="Rahil is a sullen guy, but he is very caring and loving boy.";
		String str5="My name is Malika. I want to enjoy whole life with Rahil. He is married with Malika";
		
		//length of string
		int abc=str1.length();
		System.out.println(abc);
		
		//for comparing the string
		System.out.println(str1.equals(str3));
		
		//cutting the string
	   String bac=str1.substring(2,8);
	   //(1,1) o/p-not give anything
	   //(1,2) o/p- 0
	   System.out.println(bac);
		
	   //Find the position of letter 
	   //couting from from 0 no.
	   int i=str3.indexOf("a");
	   System.out.println(i);
	   
	   int a=str3.indexOf("Rahil");
	   System.out.println(a);
	   
	   //replacing word
	   String s=str5.replace("Malika", "Mallika");
	   System.out.println(s);
	   
	   //replacing all word
	   String b=str5.replaceAll("Malika","Mallika");
	   System.out.println(b);
	   
	   //if no value exist in string then print -1
	   if(str5.indexOf("RAH")!=-1)
	   {
		   String c=str5.replace("RAH", "Rahili");
		   System.out.println(c);  
	   }
	   else 
	   {
		   System.out.println("not exist");
	       }
	   
	   //Find character by index
	   System.out.println(str1.charAt(1));
	   
	   //if string with no blank space then we use trim
	   String as="   Heloo     ";
	   System.out.println(as.trim());
	   
	   //Ignore upper and lower case 
	   System.out.println(str1.equalsIgnoreCase(str3));
	   
	   
	   
	   
	   
	   
	   
	   
		   
	}
}
	   
	   
	   
	   
	   



