package homeworkweek7;

import java.util.Scanner;

public class Programme5 {
    static String employid;
    static String empname;
    static float basicsalary, HRA, TA, DA, PF, Grosssalary;

    public void read() {

        //calculate();

    }

    public void calculate(int a) { //calculating all parameters


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the imployee ID: ");
        employid = scan.next();
        System.out.println("Enter the employee Name: ");
        empname = scan.next();
        System.out.println("Enter the Basic Salary of the employ");
        float basicsalary = scan.nextFloat();
        System.out.println("|---------------------------------------|");
        System.out.println("|               Salary Slip             |");
        System.out.println("|---------------------------------------|");
        System.out.println("| Employee ID       : " + employid + "    |");
        System.out.println("| Employee ID       : " + empname + "     |");
        System.out.println("|---------------------------------------|");
        System.out.println("| Basic Salary    : " + basicsalary + " |");
        System.out.println("| HRA 10%         : " + hra(basicsalary) + "|");
        System.out.println("| TA 8%           : " + ta(basicsalary) + "|");
        System.out.println("| DA 9%           : " + da(basicsalary) + "|");
        System.out.println("| PF 20%          : " + pf(basicsalary) + "|");
        System.out.println("|---------------------------------------|");
        System.out.println("| Gross Salary    : " + grossSalary(basicsalary) + "|");
        System.out.println("|---------------------------------------|");


    }

    public static float hra(float a) {
        return a * 0.1f;
    }

    public static float da(float a) {
        return a * 0.09f;
    }

    public static float ta(float a) {
        return a * 0.08f;
    }

    public static float pf(float a) {
        return a * 0.2f;
    }
    public static float grossSalary(float a) {
        return a + hra(a) + da(a) + ta(a) - pf(a);
    }
}


