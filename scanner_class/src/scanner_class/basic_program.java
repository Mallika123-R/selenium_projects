package scanner_class;

import java.util.Scanner;

public class basic_program {

	public static void main(String[] args)
	{
		/*Scanner name=new Scanner(System.in);
		System.out.println("Enter username");
		
		String username=name.nextLine();
		System.out.println("username is:"+username);*/
		
		Scanner value=new Scanner(System.in);
		System.out.println("Enter your name, age and salary:");
		
		String usernm=value.nextLine();
		int age=value.nextInt();
		
		
		System.out.println("User Name is:"+usernm);
		System.out.println("Your age is:"+age);
		
		
		
		
		
		
	}
}
