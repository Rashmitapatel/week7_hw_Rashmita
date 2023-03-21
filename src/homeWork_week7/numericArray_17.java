package homeWork_week7;

import java.util.Arrays;
import java.util.Collections;

/* Write a Java program to sort a numeric array and a string array.*/
public class numericArray_17 {


    public static void main(String[] args) {
//defining an array of integer type
        int[] array = new int[]{90, 23, 5, 109, 12, 22, 67, 34};
//invoking sort() method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        String[] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
// sorts array[] in descending order
        Arrays.sort(strarray, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " + Arrays.toString(strarray));


    }
}


