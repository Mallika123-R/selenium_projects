
public class basic_programming {

public static void main(String[] args) {
		
	star(4);
	star1(10);
	all_no(10);
	even_no(100);
	}
	public static void star(int a)
	{
		for(int i=1; i<=a; i++)
		{
			System.out.println("*");
		}
	}
	
	public static void star1(int b)
	{
		System.out.println("second program");
		for(int i=1; i<=b; i++)
		{
			System.out.print("* ");
		
		}
	}
	public static void all_no(int c)
	{
		System.out.println();
		System.out.println("Print all number from 1 to 10");
		for(int i=1; i<=c; i+=2)
		{
			System.out.println(i);
		}
	}
	public static void even_no(int num)
	{
		System.out.println();
		System.out.println("Print all odd no from 1 to 100");
		//int num=100;
		for(int i=1; i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
	
	

}
