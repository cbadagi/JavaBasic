package level1;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Average {
    //Take 10 integers from keyboard using loop and print their average value on the screen.

    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the 10 integers");

        for (int i=0 ;i<10;i++)
        {
            int no= Sc.nextInt();
            sum=sum+no;

        }
        System.out.println("The Average value is "+(sum/10));
    }
}
