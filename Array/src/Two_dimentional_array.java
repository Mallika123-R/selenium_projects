
public class Two_dimentional_array {

	public static void main(String[] args) {
		String str[][]=new String[3][4];
		
		//row 1
		  str[0][0]="username";
		  str[0][1]="password";
		  str[0][2]="Email";
		  str[0][3]="Mobile No.";
		  
		  //row2
		  str[1][0]="Milly123";
		  str[1][1]="123";
		  str[1][2]="abc@gmail.com";
		  str[1][3]="9814087372";
		  
		  //row3
		  str[2][0]="Rahil123";
		  str[2][1]="456";
		  str[2][2]="def@gmail.com";
		  str[2][3]="9815822331";
		  
		  
		System.out.println(str.length);// length of row
		System.out.println(str[0].length);// length of column
		
		for(int rNum=0; rNum<str.length; rNum++) {
			System.out.println("row no. is" +rNum);
		   for(int cNum=0; cNum<str[0].length; cNum++)
		   {
			   String data=str[rNum][cNum];
			   System.out.println(data);
		   }
		}

	}

}
