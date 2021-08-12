
public class Swap_strings {

	public static void main(String[] args) {
		
		String str1="Good";
		String str2="Morning";
		System.out.println("String before swapping--"+str1+ " "+str2);
		
		str1=str1+str2;
		//System.out.println(str1.length());
		//System.out.println(str2.length());
		str2 = str1.substring(0, (str1.length() - str2.length()));    
		 System.out.println(str2);
		 
        str1 = str1.substring(str2.length());   
		System.out.println(str1);
		
		System.out.println("String after swapping--"+str1+" "+str2);
		System.out.println("-----------------------------");
		  //with third variable
		String str3="Hello";
		String str4="world";
		System.out.println("Before swapping--" +str3+" "+str4);
		
        String str5=str3;
               str3=str4;
               str4=str5;
               
               System.out.println("After swapping---"+str3+" "+str4);
        
        
                         
      	

	}

}
