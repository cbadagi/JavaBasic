package datatypes;

public class DoubleToIntConversion {
    public static void main (String[] args)
    {
        //Write a program to assign a value of 100.235 to a double variable and then convert it to int.
        double var=100.235;
        int var2= (int)Math.round(var);
        System.out.println("The number "+ var +" converted from double to int is " +var2 );

    }
}
