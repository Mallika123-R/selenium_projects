import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class array_sort {

	public static void main(String[] args) {
		String[] array = {"5","dsc","abc","21","bgd","76","34"};
		
		List<String> l=Arrays.asList(array);
		Collections.sort(l);
		System.out.println(Arrays.toString(array));
	}
}
