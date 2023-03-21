package homeWork_week7;

import java.util.Scanner;

/**a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
        Commission
        Sales amount >= 50,000 35%
        Sales amount >= 30,000 20%
        >= 20,000 10%
        >= 10,000 5%
< 10,000 2% **/

public class salescommision_7 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter sales id");
        int id = s1.nextInt();
        System.out.println("Enter seller's name");
        String sname = s1.next();
        System.out.println("Enter sales amount");
        Double samount = s1.nextDouble();
        System.out.println("Enter salary basic");
        double salaryB = s1.nextDouble();
        s1.close();
        if (samount >= 50000) {
            System.out.println("sales commission 35%");
        } else if (samount>=30000) {
            System.out.println("sales commission 20% ");
        } else if (samount>=20000) {
            System.out.println("sales commission 10%");
        } else if (samount>= 10000) {
            System.out.println("sales commission 5%");
        } else if (samount<10000) {
            System.out.println("sales commission 2%");
        }else {

        }

        }

    }


