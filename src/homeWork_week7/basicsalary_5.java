package homeWork_week7;
/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
    *    HRA = basic salary 10%
     *   DA = Basic salary 8%
      *  TA = Basic salary 9%
       * PF= Basic salary 20%
        *Gross salary = basic salary + HRA + TA + DA –PF
        *Print in following format
        _______________________________
        | Salary Slip |
        |______________________________|
        | Employee Id : 2564 |
        | Employee Name : Jay |
        |______________________________|
        | Basic Salary : 25000.0 |
        | HRA 10% : 2500.0 |
        | TA 8% : 2250.0 |
        | DA 9% : 2000.0 |
        | PF - 20& : 5000.0 |
        |______________________________|
        | Gross Salary : 26750.0 |    **/

import java.util.Scanner;

public class basicsalary_5 {
    public static void main(String [] args){
double basic_salary,hra,da,ta,pf,GrossSalary;
       Scanner s1 = new Scanner(System.in);
        System.out.println("Enter employee id");
        int employeeid = s1.nextInt();
        System.out.println("Enter employee name ");
        String employeename = s1.next();
        System.out.println("Enter employee basic salary");
        double basicsalary = s1.nextDouble();
        s1.close();
        hra = (10*basicsalary)/100;
        System.out.println("HRA 10%"+" "+ hra);
        da = (8*basicsalary)/100;
        System.out.println("DA 8%"+" "+ da);
        ta = (9*basicsalary)/100;
        System.out.println("TA 9%"+" "+ ta);
        pf =(20*basicsalary)/100;
        System.out.println("PF 20%"+" "+pf);

        GrossSalary = (basicsalary+hra+da+ta-pf);
        System.out.println("Gross salary of employee:" + GrossSalary);

        System.out.println("|--------------------------------|");
        System.out.println("| Salary Slip|                   |");
        System.out.println("---------------------------------|");
        System.out.println("|Employee Id:2546                |");
        System.out.println("|Employee Name:Jay|              |");
        System.out.println("|--------------------------------|");
        System.out.println("|Basic Salary : 25000.0|         |");
        System.out.println("|HRA 10%  : 2500.0|              |");
        System.out.println("|TA 8% : 2250.0|                 |");
        System.out.println("|DA 9% : 2000.0|                 |");
        System.out.println("|PF 20% : 5000.0|                |");
        System.out.println("|--------------------------------|");
        System.out.println("|Gross Salary : 26750.0|         |");
        System.out.println("|--------------------------------|");
        System.out.println("|--------------------------------|");


    }
}
