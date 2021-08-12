interface  Language{
	 public void gettype();
	 public void getversion();
	 
	 
}
interface polygn{
	public void area(int length, int breath);
}

interface Rectangle extends polygn,Language{
	public void line(int length, int breath, int height);
	
}
class prog implements Rectangle{
	public void area(int length, int breath)
	{
		System.out.println("The area of rectangle is:"+(length*breath));
	}
	public void line(int length, int breath,int height)
	{
		System.out.println("The area of line is:"+(length*breath*height));
	}
	public void gettype()
	{
		System.out.println("Java");
	}
	public void getversion()
	{
		System.out.println("JDK 8");
	}
}


public class Interface {

	public static void main(String[] args) {
		
		prog p=new prog();
		p.area(5,6);
		p.line(4,2,3);
		p.gettype();
		p.getversion();

	}

}
