package homeWork_week7;

public class number1to100_11 {

    public static void main(String[] args) {
        int nmb = 0;
        int N = 100;
       // divisible(N);

        for (nmb = 1; nmb <= 100; nmb++) {
            System.out.println(nmb);

            while (nmb < N) {
                if (nmb % 3 == 0 && nmb % 5 == 0)
                    System.out.println(nmb + " ");
                nmb++;
            }

        }

    }
}