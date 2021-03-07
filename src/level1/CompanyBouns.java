import java.util.Scanner;

public class CompanyBouns
{
    /** A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
     Ask user for their salary and year of service and print the net bonus amount.**/
    //5% of bonus of salary
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  Salary and Year of service");
        double sal=sc.nextDouble();
        double yrexp=sc.nextDouble();
        if(yrexp>5)
        {
            double bonus=((sal*5)/100);
            System.out.println("The bounce amount is "+bonus);
        }

    }
}
