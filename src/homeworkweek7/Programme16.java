package homeworkweek7;

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {

        int a;
        //call scanner to read value
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any integer number");
        a = scan.nextInt();
        fam(a);

    }


    public static void fam(int a) {
        if (a > 0) {
            System.out.println(a + " is POSITIVE NUMBER");
        } else if (a < 0) {
            System.out.println(a + " is Negative Number");
        } else {
            System.out.println(" It is zero");
        }
    }
}