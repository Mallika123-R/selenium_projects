
public class String_conversion {

	public static void main(String[] args) {
		
		//string to primitive
		String str="124";
		int i=Integer.parseInt(str);
		System.out.println("String to int-->"+i);
		
		String str1="456485765487";
		Long l=Long.parseLong(str1);
		System.out.println("String to long--->"+l);
		
		// primitive to wrapper classes
		int var1=5;
		double var2=5.78;
		boolean b=true;
		
		Integer obj1=Integer.valueOf(var1);
		Double obj2=Double.valueOf(var2);
		Boolean obj3=Boolean.valueOf(b);
		
		if(obj1 instanceof Integer)
		{
			System.out.println("An object of integer is created");
		}
		if(obj2 instanceof Double)
		{
			System.out.println("An object of Double is created");
		}
		if(obj3 instanceof Boolean)
		{
			System.out.println("An object of Boolean is created");
		}
		
		//wrapper classes to primitive
		Integer ob1=Integer.valueOf(3);
		Double ob2=Double.valueOf(4.56);
		Boolean ob3=Boolean.valueOf("False");
		
		int vr1=ob1.intValue();
		double vr2=ob2.doubleValue();
		boolean vr3=ob3.booleanValue();
		
		System.out.println("The value of int variable-->" +vr1);
		System.out.println("The value of double variable-->" +vr2);
		System.out.println("The value of boolean variable-->" +vr3);
		
		//wrapp to string
		Integer myInt= 100;
		String strng =myInt.toString(myInt);
		System.out.println("The value of string-->"+strng);
		System.out.println("The length of string-->"+strng.length());
		
		

	}

}
