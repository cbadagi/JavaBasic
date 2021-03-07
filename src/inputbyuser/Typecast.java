package inputbyuser;

import java.util.Scanner;

public class Typecast {
    public static void main(String[] args)

    {
        //Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value for the length of the rectangle in double data type");
        double len=scanner.nextDouble();
        System.out.println("Enter the value for the breadth of rectangle in double data type");
        double brd=scanner.nextDouble();
        double area=len*brd;
        System.out.println("The area of the Recatngle is "+ (int)area );

    }
}
