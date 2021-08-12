class Math{
	public void sum(int a, int b)
    {
		System.out.println("first method");
  	  System.out.println("sum of first method is "+(a+b));
  	  
    }
}
class mathamatics extends Math{
	public void sum(int c, int d, int a, int b)
	{
		System.out.println(c+d);
		System.out.println("second method"+(c+d));
		super.sum(a, b);
	}
}
public class overriding {
   
	public static void main(String[] args) {
		Math m=new mathamatics();
		m.sum(2, 5);
		m.sum(3, 6);
		
		/*Math m1=new Math();
		m1.sum(3, 3);*/
	
		
	}

}
