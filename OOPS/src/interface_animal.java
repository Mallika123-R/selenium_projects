interface Drawable{
	void draw();
}

class circle implements Drawable{
	  
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
}
	
class Square implements Drawable{
	
	public void draw()
	{
		System.out.println("drawing square");
	}
	public void size()
	{
		System.out.println("length * breath");
	}
}
	
public class interface_animal{
	
	public static void main(String[] args)
	{
		Drawable d=new circle();
		d.draw();
		
		Drawable d1=new Square();
		d1.draw();
		
		
		Square s=new Square();
		s.size();
		s.draw();

		
	}
}
