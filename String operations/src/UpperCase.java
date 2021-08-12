import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		System.out.println("Enter String\n");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String uppercase=str.toUpperCase();
		System.out.println("Before upper case function--"+str);
		System.out.println("After upper case function---" +uppercase);
		System.out.println("--------------------");
		String str1="Welcome in this World";
		for(int i=0; i<str1.length(); i++)
		{
			if(Character.isUpperCase(str1.charAt(i)))
				System.out.print(str1.charAt(i));
		}
		

	}

}
