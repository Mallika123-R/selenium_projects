
public class constructor_without_parameter {
	int length, breath;
	static int result;
	// without parameters
	constructor_without_parameter()
	{
		length=100;
		breath=200;
		result=length*breath;
	}

	public static void main(String[] args) {
      constructor_without_parameter c=new constructor_without_parameter();
      System.out.println(result);

	}

}
