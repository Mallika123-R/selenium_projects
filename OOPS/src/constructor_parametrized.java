
public class constructor_parametrized {
    
	int a, b;
	int c;
	constructor_parametrized(int x, int y)
	{
		c=x+y;
	}
	public static void main(String[] args) {
		constructor_parametrized cp=new constructor_parametrized(2,4);
		constructor_parametrized cp1=new constructor_parametrized(3,4);
		System.out.println(cp.c);
		System.out.println(cp1.c);

	}

}
