

import java.util.Scanner;

public class GreatestOfTwo {

    public  static void main (String []args){
        //Take two int values from user and print greatest among them.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Two numbers:");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        if(a>b){
            System.out.println("The greatest Number is "+a);
        }
        else{
            System.out.println("The greatest number is "+b);
        }

    }
}
