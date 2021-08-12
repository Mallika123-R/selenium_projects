
public class split_string {

	public static void main(String[] args) {
		String abc="order is processed and transaction ID is 12345";
		String result[]=abc.split("processed");
		
		System.out.println("The length of the string is\t" +result.length);
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		String rslt[]=abc.split("is");
		System.out.println("The length of the string is\t" +rslt.length);
		System.out.println(rslt[0]);
		System.out.println(rslt[1]);
		System.out.println(rslt[2]);
		
		System.out.println(result[result.length-1]);

	}

}
