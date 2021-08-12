
class Mahindra_Inheritance {

	int seat;
	int speed;

	public Mahindra_Inheritance() {
		System.out.println("default cons of Parent class");
		// TODO Auto-generated constructor stub
	}

	public Mahindra_Inheritance(int s, int s2) {
		seat = s;
		speed = s2;
		System.out.println("parameter cons of Parent class");
		// System.out.println(+s+""+s2);
	}

	protected void runs() {
		System.out.println("Parent Class ahindra Method");
	}
}

class Scorpio extends Mahindra_Inheritance {
	int no_of_gears;

	Scorpio() {
		this(10);
		System.out.println("child class default construc");
	}

	Scorpio(int n) {
		no_of_gears = n;
		System.out.println("child class construc paraeter "+no_of_gears);
	}
	public void automatic()
	{
		System.out.println("Automatic CHild Class method");
	}

	  public void runs() {
		System.out.println("child Class Overrided ahindra Method");
		
	}

}

class Inheritance_exp 
{
public static void main(String[] args) {

	Scorpio s = new Scorpio();
	s.automatic();
	s.runs();
}	
}
