import java.util.Scanner;

public class scanner_prog {

	public static void main(String[] args) {
		
		int i=0;
		
		Scanner oddeven=new Scanner(System.in);
		System.out.println("Enter any number between 1 to 100");
		
		for(i=0;i<=5;i++)
		{
		int num=oddeven.nextInt();
	
		
			 if(num%2==0)
			 {
				 System.out.println("This given number is even number");
			 }
			 else
			 {
				 System.out.println("This given number is odd number");
			
			 }
		}
		System.out.println("you can enter only 5 times");
			
		
	}
	

}
