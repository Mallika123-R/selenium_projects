
public class CompareString {

	
	public static void main(String[] args) {
		
		String s1="ABC";
		String s2="ABC";
		String s3=new String("ABC");
		String s4=new String("ABC");
		String s5=s1;
		String s6=new String(s3);
		String s7="abc";
		String s8 = new String("abc");
		
		System.out.println(s3==s6);
		System.out.println(s3.equals(s6));
		System.out.println(s3==s7);
		System.out.println(s5.equals(s7));
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);;
		System.out.println(s1==s5);
		System.out.println(s2==s6);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s6));
		System.out.println(s4.equals(s6));
	}
}
