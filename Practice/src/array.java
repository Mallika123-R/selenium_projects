
public class array {

	
	public static void main(String[] args) {
		
		int a[]={3,6,56,33,23};
		
		System.out.println("print elements");
		for(int i=0;i<a.length;i++)	
			
		{
			System.out.println(a[i]); 
			
		}
		System.out.println("print elements in reverse");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
			
		}
		
		System.out.println("print sum of elements in array");
		int b=0;
        for(int i=0;i<a.length;i++)	
			
		{
        	b=b+a[i];
			System.out.println(b); 
	
		}
		System.out.println("length of array is "+ a.length);
		

	}

}
