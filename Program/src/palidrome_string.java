import java.util.Scanner;

public class palidrome_string {

	public static void main(String[] args) {
		
		String str, rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		str=sc.nextLine();
		int length=str.length();
		
		for(int i=length-1; i>=0; --i)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("This string is palidrome");
			
		}
		else
		 System.out.println("This string is not palidrome");
		

	}

}
