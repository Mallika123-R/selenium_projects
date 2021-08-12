import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class array_sort {

	public static void main(String[] args) {
		
		int arr[]= {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.print(" "+arr[i]);
			
		}
		System.out.println();
		
		System.out.println("---Another method------");
		int arr1[]={12,0,-1,35,-2,46,23};
		for(int i=0; i<arr1.length; i++)
		{
			Arrays.sort(arr1);
			System.out.print("\t"+arr[i]);
			
		}
	}
}
