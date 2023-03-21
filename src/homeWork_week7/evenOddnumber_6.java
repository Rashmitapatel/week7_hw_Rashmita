package homeWork_week7;

import java.util.Scanner;

/**java program to input any number and find out if it’s odd or even**/
public class evenOddnumber_6 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number");
        double number = s1.nextDouble();
        s1.close();
        if(number/2==0) {
            System.out.println("Number is Even");
        } else{
            System.out.println("number is Odd");
        }
    }
}
