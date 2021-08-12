import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
	  int n;
      
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number for check even or odd");
	  n=sc.nextInt();
		  if(n%2==0)
		     System.out.println("This is even no.");
	     
		  else
			  System.out.println("This is odd no.");
      

	}

}
