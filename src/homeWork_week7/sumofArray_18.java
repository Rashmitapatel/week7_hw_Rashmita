package homeWork_week7;

import java.util.Arrays;

/* write a java programme for sum  value of  an array.*/
public class sumofArray_18 {

// import Arrays class to use inbuilt sum() method


        public static void main (String[] args) {
            int [] nums  = {1,2,3,4,5};
            int sum = Arrays.stream(nums).sum();
            System.out.println(sum);
        }
    }


