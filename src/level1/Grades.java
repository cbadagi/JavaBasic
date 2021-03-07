package level1;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args)
    {
        /**school has grade system  Below 25 - F
         b. 25 to 45 - E
         c. 45 to 50 - D
         d. 50 to 60 - C
         e. 60 to 80 - B
         f. Above 80 - A
         Ask user to enter marks and print the corresponding grade.**/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter average of your marks ::");
        int marks = sc.nextInt();
        char grade;

        if(marks>=80){
            grade = 'A';
        }else if(marks>=60 && marks<80){
            grade = 'B';
        }
        else if(marks>=50 && marks<60){
            grade = 'C';
        }
        else if(marks>=45 && marks<50){
            grade = 'D';
        }else if(marks>=25 && marks<40){
            grade = 'E';
        }else {
            grade='F';
        }

        switch(grade) {
            case 'A' :
                System.out.println("Your grade is A!");
                break;
            case 'B' :
                System.out.println("Your grade is B!");
                break;
            case 'C' :
                System.out.println("Your grade is C!");
                break;
            case 'D' :
                System.out.println("Your grade is D!");
            case 'E' :
                System.out.println("Your grade is E!");
                break;
            default :
                System.out.println("Your grade is F!");
        }

    }
}


