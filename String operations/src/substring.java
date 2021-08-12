import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String--");
		String str=sc.nextLine();
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(2,5));
		
		String str1="javais good";
		System.out.println(str1.substring(0,7));

	}

}
