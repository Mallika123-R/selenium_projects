
public class Intersection_array {

	public static void main(String[] args) {
		int[] x= {1,2,5,4,6};
		int[] y= {3,5,7,6,8};
		
		System.out.println("The first array is:");
		for(int i=0; i<x.length; i++)
		{
			
			System.out.print(x[i]+" ");
			
		}
		System.out.println();
		System.out.println("The second array is:");
		
		for(int i=0; i<y.length; i++)
		{
			
			System.out.print(y[i]+" ");
		}
		System.out.println();
		System.out.println("Intersaction of array is:");
		intersection(x,y);

	}
	public static void intersection(int arr1[], int arr2[])
	{   
		int c=0;
		int z[]=new int[arr1.length+arr2.length];
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					z[c]=arr1[i];
					c++;
					
				}
				else 
					continue;
			}
		}
		
		for(int k=0; k<c;k++)
		{
			System.out.print(" "+z[k]+" ");
		}
		System.out.println(" ");
	}

}
