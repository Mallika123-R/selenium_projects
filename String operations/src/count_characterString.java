
public class count_characterString {

	public static void main(String[] args) {
		String str="Mallika";
		int count=0;
		
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total no of character are : "+count);

	}

}
