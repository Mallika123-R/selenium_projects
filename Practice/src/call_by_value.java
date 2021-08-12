
public class call_by_value {
	
     int data=50;
	
	public static void change(int data)
	{
		data=data+100;
		System.out.println(data);
	}

	public static void main(String[] args) {
		call_by_value op=new call_by_value();
		System.out.println("before changing" +op.data);
		change(60);
		op.change(200);
		System.out.println("After changing" +op.data);
		

	}

}
