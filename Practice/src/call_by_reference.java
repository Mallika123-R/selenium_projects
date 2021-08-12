
public class call_by_reference {
    int data=20;
    public void change(call_by_reference op)
    {
    	data=data+100;
    
    }
	
	
	public static void main(String[] args) {
		call_by_reference op=new call_by_reference();
		System.out.println("before changing" +op.data);
		//change(50);
		op.change(op);
		System.out.println("After changing" +op.data);

	}

}
