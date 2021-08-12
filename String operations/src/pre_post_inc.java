
public class pre_post_inc {

	public static void main(String[] args) {
		int i=100;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(i--);
		System.out.println(i);
		
		int j=400;
		int l=100;
		int n=j++ + l++;
		System.out.println(n++);
		System.out.println(n);

	}

}
