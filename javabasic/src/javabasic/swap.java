package javabasic;

public class swap {

	public static void main(String[] args) {
		//using third variable
		int a=4;
		int b=3;
		System.out.println("Before swapping--"+a+ " "+b);
        
		int c=a;
		    a=b;
		    b=c;
		    System.out.println("After swapping---"+a+ " "+b);
		    
		 // without third variable
		    
		    int a1=5;
		    int b1=6;
		    System.out.println("Before swapping---"+a1+" "+b1);
		    
		    a1=a1+b1;
		    b1=a1-b1;
		    a1=a1-b1;
		    
		    System.out.println("After swapping----"+a1+ " "+b1);
		  
	}

}
