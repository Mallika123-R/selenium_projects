
public class reverse_char_INstring {

	public static void main(String[] args) {
		System.out.println("----Reverse character------");
		String str="INDIA IS GREAT";
		String reversed="";
		String[] split=str.split(" ");
		
		for(int i=0; i<split.length; i++)
		{
			String word=split[i];
			String rev=" ";
			int length=word.length()-1;
			for(int j=length; j>=0;j--)
			{
				 rev=rev+word.charAt(j);
			}
			reversed=reversed+rev+ " ";
			
		}
		System.out.println(reversed);
		

	}

}
