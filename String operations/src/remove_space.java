import java.util.Scanner;

public class remove_space {

	public static void main(String[] args) {
		String str="   My  Name   ";
		System.out.println("Before trim--- \""+str+"\"");
		System.out.println("After trim---  \""+str.trim()+"\"");
		System.out.println("After replace function: \"" + str.replace(" ","")+"\"");
	  
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		
		System.out.println("with space string--"+str1);
		String withoutSpace=str1.replaceAll("\\s+", "");
		
		System.out.println("without space String--" +withoutSpace);
				
		
		

	}

}
