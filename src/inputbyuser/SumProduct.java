package inputbyuser;

import java.util.Scanner;

public class SumProduct {

    public static void main(String[] args)
    {
        //Write a program to take two integer inputs from user and print sum and product of them.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the integer number1:");
        double num1=scanner.nextDouble();
        System.out.println("Enter the integer number2:");
        double num2=scanner.nextDouble();
        System.out.println("The Sum of "+num1 +"and"+num2+ "is "+(num1+num2));
        System.out.println("The product of "+num1 +" and " +num2 +" is "+(num1*num2));
    }
}
