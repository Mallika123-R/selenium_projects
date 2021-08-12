
public class Arrays {

	public static void main(String[] args) {
		String arr[]= new String[4];
		arr[0] = "India";
		arr[1]="China";
		arr[2]="Australia";
		arr[3]="Canada";
		System.out.println(arr[3]);
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
        for(String s : arr)
        {
        	System.out.print(s);
        }
        	
	}

}
