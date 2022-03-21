package homeworkweek7;

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter the operation you want to perform(+,-,*,/: ");
        ch = scan.next().charAt(0);
        if (ch == '+') {
            System.out.println("Addition of +num1+" + " num2 +  =  " + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Substraction of" + num1 + "-" + num2 + " =  " + (num1 - num2));

        } else if (ch == '*') {
            System.out.println("Multiplication of" + num1 + "*" + num2 + " =  " + (num1 * num2));
        } else if (ch == '/') {
            System.out.println("Division of" + num1 + "/" + num2 + " =  " + (num1 / num2));
        } else {
            System.out.println("Operation is not available");
        }

}
}
