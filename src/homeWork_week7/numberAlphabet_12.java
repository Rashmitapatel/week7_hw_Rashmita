package homeWork_week7;
/*Write a program that tells us input value is number or an alphabet or symbol.*/

import java.util.Scanner;

public class numberAlphabet_12 {
   // ASCII value ranges-
   // For capital alphabets 65 – 90
   // For small alphabets 97 – 122
   // For digits 48 – 57

// Java program to find type of input character





        static void charCheck(char input_char)
        {
            // CHECKING FOR ALPHABET
            if ((input_char >= 65 && input_char <= 90)
                    || (input_char >= 97 && input_char <= 122))
                System.out.println(" Alphabet ");

                // CHECKING FOR DIGITS
            else if (input_char >= 48 && input_char <= 57)
                System.out.println(" Digit ");

                // OTHERWISE SPECIAL CHARACTER
            else
                System.out.println(" Special Character ");
        }

        // Driver Code
        public static void main(String[] args)
        {
            Scanner s1 = new Scanner(System.in);
           // System.out.println("Enter alphabet, digit, Special Character" );

            char input_char = '$' ;
            charCheck(input_char);

        }
    }

