
public class sumEven_array {

	public static void main(String[] args) {
		int arr[]= {1,2,5,4,6,3};
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
			  sum=sum+arr[i];
			}
		}
		System.out.println(sum);

	}

}
