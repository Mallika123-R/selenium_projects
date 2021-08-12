
public class armstrong {

	public static void main(String[] args) {
		int n=153;
		int c=0;
		int temp=n;
		while(n>0)
		{
			int a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		{
			System.out.println("This no. is Armstring no.");
		}
		else {
			System.out.println("This no. is not armstrong no.");
		}
	}

}
