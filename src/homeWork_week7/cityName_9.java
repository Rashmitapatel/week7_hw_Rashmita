package homeWork_week7;
/*8 any alphabet from “A" to “F” and print their city name
accordingly (use if else) if  any other alphabet should be invalid entry
 */
public class cityName_9 {


        public static void main(String[] args) {
            int alphabet = 6;
            switch (alphabet) {
                case 1:
                    System.out.println("Ahemedabad");
                    break;
                case 2:
                    System.out.println("Bengaluru");
                    break;
                case 3:
                    System.out.println("chennai");
                    break;
                case 4:
                    System.out.println("Dehradun");
                    break;
                case 5:
                    System.out.println("Ernakulam");
                    break;
                case 6:
                    System.out.println("Fagu");
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
            if (  alphabet== 6 ) {
                System.out.println("valid entry");
            }else {
                System.out.println("invalid entry");
            }
            }
        }

