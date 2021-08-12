package javabasic;

public class static_nonstatic {

	int a=5;
	static int b=3;
	
	public void login()
	{
		System.out.println(a);
		System.out.println(b);
			
		
	}
	public static void logout()
	{
		//System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		static_nonstatic.logout();
		static_nonstatic sn=new static_nonstatic();
		sn.login();
	}
}
