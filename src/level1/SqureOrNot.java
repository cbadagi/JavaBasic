package level1;

import java.util.Scanner;

public class SqureOrNot {

    public static void main(String[]args)
    {
        //Take values of length and breadth of a rectangle from user and check if it is square or not
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value for the length of the rectangle in double data type");
        double len=scanner.nextDouble();
        System.out.println("Enter the value for the breadth of rectangle in double data type");
        double brd=scanner.nextDouble();
        double sqlen=Math.sqrt(len);
        System.out.println(sqlen);
        double sqbrd=Math.sqrt(brd);
        if (len==(sqlen *sqlen) && ((sqbrd*sqbrd)==brd))
        {
            System.out.println("The length and brd are  square number");

        }
        else {
            System.out.println("The length  or  brd are not square number");
        }



    }
}
