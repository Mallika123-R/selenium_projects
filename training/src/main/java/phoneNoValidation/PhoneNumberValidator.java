package phoneNoValidation;


import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneNumberValidator {
	String regx;
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberValidator object = new PhoneNumberValidator();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }

    public String getInput() {
		
		System.out.println("Enter mobile number");
		String phone =sc.next();
		
		 
      return phone;
    }

    public void displayResult(boolean result) {
       
	   if(result)
		 System.out.println("valid phone number"+result); 
      
	   else if(regx==null)
	   {
		   System.out.println("Invalid and empty string "+result);
	   }
        else
         System.out.println("Invalid and empty string "+result);			
    }

    public boolean validatePhoneNumber(String s) 
	{
    
    	regx="\\d{10}|\\d{2}-\\d{3}-\\d{5}|\\d{3}-\\d{3}-\\d{4}|\\d{2}-\\d{2}-\\d{6}|\\d{2}-\\d{4}-\\d{4}|\\d{3}-\\d{2}-\\d{5}";
    
    	
       return s.matches(regx);
       
    	
    }
}

