package datatypes;

public class AsciiAddThree {

    public static void main(String [] args)
    {
        //Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
        char ch1='d';
        int ascivalue=ch1;
        int sum= ascivalue+3;
        char ch2=(char)sum;
        System.out.println("The ASCII value of " + ch1 +" is " +ascivalue);
        System.out.println("The Ascii value after adding 3 is " +sum);
        System.out.println("The Equivalent character after adding 3 to 'd' is "+ ch2);

    }
}
