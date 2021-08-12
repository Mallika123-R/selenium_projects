public class duplicate_string {
 
	public static void main(String args[]) {
    
		 String str1="Mallika";
		char[] str=str1.toCharArray();
		 for(int i=0; i<str1.length(); i++)
		 {
			 for(int j=i+1; j<str1.length(); j++)
			 {
				 if(str[i]==str[j])
				 {
					 System.out.println(str[j]);
				 }
			 }
		 }
  
    }
}