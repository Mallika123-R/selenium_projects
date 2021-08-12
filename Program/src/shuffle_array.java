import java.util.Arrays;
import java.util.Random;

public class shuffle_array {

	public static void main(String[] args) {
		int[] arr= {4,3,1,7,8,4,2,1};
		Random rand=new Random();
		
		for(int i=0; i<arr.length; i++)
		{
			int shuffle=rand.nextInt(arr[i]);
			int temp=arr[shuffle];
			arr[shuffle]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
