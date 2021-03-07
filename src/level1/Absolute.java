import java.util.Scanner;

public class Absolute
{
    public static void main(String[] args)
    {
        //Write a program to print absolute vlaue of a number entered by user. E.g.-
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Absolute value");
        int no=sc.nextInt();
        System.out.println("The Absoulte value of a number is "+Math.abs(no));
    }

}
