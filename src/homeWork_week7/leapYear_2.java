package homeWork_week7;
/**a java program to input any year like (ex.2007)
 *
 *and find out if it is leap year or  not? */

import java.util.Scanner;

public class leapYear_2 {
    public static void main(String[] args) {
        Scanner s1 =  new Scanner(System.in);
        System.out.println("Enter your year");
        int year = s1.nextInt();
        s1.close();

        if(year % 4==0){
            System.out.println("This is  a leap");
        }else{
            System.out.println("This is not a leap year");
        }
    }
}
