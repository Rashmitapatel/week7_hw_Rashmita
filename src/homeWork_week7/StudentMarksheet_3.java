package homeWork_week7;
/*8a java program to input student Name, roll No, and three subjects
*
* Math, Science and  English marks (marks is between 0 to 100 and
*if it is out of range print error message
*“Invalid  Input, Marks should between 0 to 100”) and find out total, percentage and
result.

      *  If he is pass or fail on basis of percentage (pass>=35)
      *  and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C
       *  And print Mark Sheet in following
 */
import java.util.Scanner;

public class StudentMarksheet_3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter student Name");
        String Name = s1.next();
        System.out.println("Enter student roll No");
        int rollno = s1.nextInt();
        System.out.println("Enter Maths Marks");
        double Marks1 = s1.nextDouble();
        System.out.println("Enter Science Marks");
        double Marks2 = s1.nextDouble();
        System.out.println("Enter  English Marks");
        double Marks3 = s1.nextDouble();
        s1.close();

        double total = Marks1 + Marks2 + Marks3;
        System.out.println("Total marks is: " + total);
        double percentage = (total * 100) / 300;
        System.out.println(" percentage is:" + percentage);


        if (percentage >= 35) {

            System.out.println("Pass");
        } else if (percentage >= 80) {
            System.out.println("Grade A+");
        } else if (percentage >= 60) {
            System.out.println("Grade A");
        } else if (percentage >= 50) {
            System.out.println("Grade B");
        } else if (percentage >= 35) {
            System.out.println("Grade C  ");
            //System.out.println("Fail");//
        } else

            System.out.println("fail");
    }

}

