package level1;

public class Pattern {

    /**Print the following patterns using loop :
     a. b.1010101
            10101
                101
                    1
     *
     **
     ***
     ****
     **/
    public static void main(String[]args)
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int rows=4;
        for(int i=rows;i>=0;i=i-2)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("1" + "0");

            }
            System.out.println( );

        }

    }
}
