package Rectangle;

import java.util.Scanner;

public class Rec_Perimeter {
    public static void main(String[] args) {
        new Rec_Perimeter().getValues();
    }

    //get user input from console
    public void getValues() {
     Scanner scan=new Scanner(System.in);
     System.out.println("Calculate Area of Rectangle");
     Double length=scan.nextDouble();
     Double breadth=scan.nextDouble();
     
     Rec_Perimeter rect=new Rec_Perimeter();
     Double area= rect.perimeterCalculator(length, breadth);
     System.out.println(area);
    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
    	
    	
    	
        return 2 * (length + breadth);
    }
}
