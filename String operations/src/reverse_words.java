
public class reverse_words {

	public static void main(String[] args) {
		System.out.println("----Reverse String------");
		String str1="INDIA IS GREAT";
		String[] split=str1.split(" ");
		int a=split.length;
		for(int i=a; i>0; i--)
		{
			System.out.println(split[i-1]);
		}
	}

}
