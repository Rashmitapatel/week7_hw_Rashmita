package homeWork_week7;

import java.util.Scanner;

public class cityName_8 {
    public static void main(String[] args) {
   String a1 = "A B C D E F ";
  // String b1 = " G to Z";
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter  A=ahemdabad,B = Bengluru,C= calcutta,D= dehradun,E=erakulam,F=Fagu :");
       String alphabet = s1.next();
s1.close();
        if(alphabet ==" A,B,C,D,E,F"){
            System.out.println("valid Entry");
        //}else if (alphabet == "G,....,Z"){
          //
            //
            //  System.out.println("Invalid Entry");

        }else{
            System.out.println("Invalid Entry");

        }


    }
}