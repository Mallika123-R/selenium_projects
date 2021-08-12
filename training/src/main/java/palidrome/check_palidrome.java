package palidrome;


import java.math.BigInteger;
import java.util.Scanner;

public class check_palidrome {
	
	BigInteger n;
	

    public static void main(String[] args)
    {
    	new check_palidrome().getValue();
    	//BigInteger abc=  new check_palidrome(). palindromeValidator(reverseN);
       //new check_palidrome(). outputPrinter(abc);
    }

    

	// get values from the user using scanner
    public void getValue()
    {

    Scanner sc=new Scanner(System.in);
    System.out.println(" Check whether a number is palindrome ");
    n=sc.nextBigInteger();
    
    if(n==null)
    {
     System.out.println("It's an Empty String");
    }
	else if(n.toString().contains(".")||n.toString().contains("[a-zA-Z\\-#\\.\\(\\)\\/%&\\s]"))
	{
		System.out.println("Number is invalid, contains Decimal Value");
	}
	else
	{
    
    palindromeValidator(n);
	}
    //return n;
    }

    

	// validate the input using inputValidator and print the error message or the result from palindromeValidator
   public void outputPrinter(BigInteger number) {
	   boolean inputValidate=inputValidator(number.toString());
	   String outputValue=palindromeValidator(number);
	   
	   	if(number.toString()==outputValue)
	   	{
	            System.out.println("Palindrome = Yes");
	   	}
	        else
	        {
	            System.out.println("Palindrome = No");
	        }
	       
	    
	  
	   	}
     
   
    // check whether the input is a valid integer and return boolean
    public boolean inputValidator(String Number) 
    {
    	if(Number==null)
        {
         System.out.println(Number+ "Enter any Number");
         return false;
        }
    	else if(Number.toString().contains(".")||Number.toString().contains("[a-zA-Z\\-#\\.\\(\\)\\/%&\\s]"))
    	{
    		System.out.println(Number+"Number is invalid, contains Decimal Value");
    		return false;
    	}
    	return true;
    }


    // write logic to check for palindrome using BigInteger & Do-while
    public String palindromeValidator(BigInteger number) {
    
    	
    		String s = number.toString();
    		StringBuilder sb = new StringBuilder(s);
            
    	if(sb.reverse().toString().startsWith("-")||sb.reverse().toString().length()<=1)
    	{
    		System.out.println("Reverse String is Invalid");
    	}
    		
    	StringBuilder revStringBuilder = sb.reverse();
    	String revString = revStringBuilder.toString();
    		
    	outputPrinter(revString);
    	//inputValidator(revString);	
    	return revString;
    	
    	
    	
     }
}
