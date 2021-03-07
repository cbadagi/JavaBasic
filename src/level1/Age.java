import java.util.Scanner;

public class Age {

    public static void main(String[]args)
    {
        /**
         * Take input of age of 3 people by user and determine oldest and youngest among them.
         */
        int highest=0;
        int smallest=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age of 3 people");
        for (int i=0;i<3;i++)
        {
            int n=sc.nextInt();
            if (n>highest)
            {
                highest=n;
            }
            if(n<smallest)
            {
                highest=smallest;
                smallest=n;
            }

        }
        System.out.println("The Oldest  age is "+highest);
        System.out.println("The Youngest age  is "+smallest);

    }
}
