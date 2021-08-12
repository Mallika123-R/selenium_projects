
public class post_pre_inc {

	public static void main(String[] args) {
		int i=100;
		//post inc first execute i value then increment
		System.out.println(i++);
		System.out.println(i);
		
		int j=500 + i++;
		System.out.println(j);
		System.out.println(i);
		
		//pre inc 
		int bv=200;
		System.out.println(++bv);
		
		for(i=1;i<=100; i++)
		{
			System.out.println(i);
		}
		
		for(i=1;i<=10;i++)
		{
			
			System.out.println("4 *" +i+"="+i*4);
		}
		
		String s="My name is Mallika";
		System.out.println(s.length());
		for(int h=0;h<=s.length();h++)
		{
			System.out.print(h);
			System.out.println(s.charAt(h));
			
		}
		

	}

}
