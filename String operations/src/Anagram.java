import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*int[] array = {1, 2, 3, -1, -2, 4};

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));*/
		boolean result=isAnagram("now Fine","owninaf");
		System.out.println(result);
		
	}
	public static boolean isAnagram(String first, String second)
	{
		//remove white space
		first=first.replaceAll("\\s", "").toLowerCase();
		second=second.replaceAll("\\s", "").toLowerCase();
		
		//compare length
		if(first.length()!=second.length())
		return false;
		
		//string to char
		char[] firstArray=first.toCharArray();
		char[] secondArray=second.toCharArray();
		//sorting
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		return Arrays.equals(firstArray,secondArray);
	}

}
