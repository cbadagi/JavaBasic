import java.util.Scanner;

public class Attendance {

    public static void main(String[] args) {
        /**8.
         A student will not be allowed to sit in exam if his/her attendence is less than 75%.
         Take following input from user Number of classes held Number of classes attended. And print
         percentage of class attended  Is student is allowed to sit in exam or not.
         **/


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of classes held ");
        int TotalClasses = sc.nextInt();
        System.out.println("and  Number of classes attended");
        int NofClassAtt = sc.nextInt();
        String Reason;
        System.out.println("Enter if any medical reson as Y /N");
        Reason=sc.next();
        double perAttendece;
        perAttendece = (float)((NofClassAtt*100)/TotalClasses);
        System.out.println("The percentage of attenace is " + perAttendece + "%");
        if (perAttendece < 75 || Reason=="N")
        {
            System.out.println("The Student is not allowed to attend the exam");

        }
        else if (perAttendece<75 && Reason=="Y")
        {
            System.out.println("The student is allowed to attend the Exam due to medical reason");
        }
        else {
            System.out.println("The Student is allowed to attened the exam");
        }
    }
}