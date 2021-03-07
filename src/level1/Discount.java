import java.util.Scanner;

public class Discount {

        /**A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
         Ask user for quantity
         Suppose, one unit will cost 100. Judge and print total cost for user.
         **/
        public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of units");
            int Units = sc.nextInt();
            //cost of 1 unit is 100
            double TotalCost = 100 * Units;
            double DiscountRate = 10;
            double Discount;
            if (TotalCost > 1000)
            {
                Discount = (TotalCost * DiscountRate) / 100;
                TotalCost = (TotalCost - Discount);
                System.out.println("The Final Total price after the discount rate is " + TotalCost);
            }
            else
                {
                    System.out.println("The Total cost of the quanity without discount is "+TotalCost);
                }


        }

     }
