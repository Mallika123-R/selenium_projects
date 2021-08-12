
public class overloading {

	public static void display(int a)
	{
		System.out.println("Argument:"+a);
	}
	public static void display(int a, int b)
	{
		System.out.println("Argument 2:"+a+" "+b);
	}
	public static void main(String[] args) {
		display(2);
		display(3,5);
		

	}

}
