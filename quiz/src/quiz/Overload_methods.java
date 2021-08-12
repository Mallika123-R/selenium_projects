package quiz;

public class Overload_methods
{
public static void main(String[] args)
{
Test obj= new Test();
int a = 2;
double b = 3.2;
obj.add(a, a);
obj.add(b, b);
System.out.println(obj.x + " " + obj.y);
}
}