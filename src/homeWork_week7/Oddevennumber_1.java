package homeWork_week7;
/**
 * a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Oddevennumber_1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = s1.nextInt();
        s1.close();

        //ternery operator to check number
        String result = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(number + " " + "is" + " " + result);

    }
}
