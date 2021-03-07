package operators;

import java.util.Scanner;

public class FernitToCelsius {

    public static void main(String[] args)
    {
        // Write a program to convert Fahrenheit into Celsius.
        /** Subtract 32 from the Fahrenheit temperature.
         Multiply this number by five.
         Divide the result by nine.**/
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit");
        double temp=scanner.nextDouble();
        double cel=(((temp-32)*5)/9);
        System.out.println("The Temperature after conversion to celsius is "+cel);
    }
}