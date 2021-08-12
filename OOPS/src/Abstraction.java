abstract class Animal{
	abstract  void makesound();
	Animal(){
		System.out.println("constructor of Astract class");
	}
	public void eat()
	{
		System.out.println("I want to eat fruits");
	}
	
}
class Dog extends Animal{
	
	public void makesound() {
		System.out.println("Bark Bark");
	}
	public void msg()
	{
		System.out.println("Marshal");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		 
		d.makesound();
		d.msg();
		d.eat();
		

	}

}
