package com.Interview_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import io.opentelemetry.correlationcontext.Entry;
//import java.util.Map;

public class practice {

	public static void main(String[] args) {
		
	   int arr[]= {-1,6,2,9,-2};
	   
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
	}
}