
public class largest_smaalest_array {

	public static void main(String[] args) {
		int arr[]= {4,67,2,56,23,5};
		int largest=arr[0];
		int smallest=arr[0];
		int secondLargest=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			//largest element
			if(arr[i]>largest)
			{   
				largest=arr[i];
			}
			//second largest element
			if(arr[i]>arr[i])
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]!=largest)
				secondLargest=arr[i];
			
			//smallest element
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(largest+" "+smallest+"  "+secondLargest);
	}

}
