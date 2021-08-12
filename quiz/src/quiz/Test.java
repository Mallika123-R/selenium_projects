package quiz;

public class Test {

public static void main(String[] args) {

testMe();

}

public static void testMe() {


try
{
System.out.print(" A ");

}catch(Exception e) {
System.out.println(" B ");
}
finally {
System.out.print(" C ");
}



}


}