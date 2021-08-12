import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter prime no.");
		int a=sc.nextInt();
		
		int flag=0;
		int m=a/2;
		if(a==0||a==1)
		{
			System.out.println("not prime no.");
			
		}
		else {
			
		
			for(int i=2; i<=m; i++)
			{
				if(a%i==0)
				{
					System.out.println("not prime");
					flag=1;
					break;
				}
			} 
			     if(flag==0)
				{
					System.out.println("this prime no.");
				}
			
		}

	}

}
