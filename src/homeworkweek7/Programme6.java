package homeworkweek7;

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("The given number " + x + " is Even ");
        } else {
            System.out.println("The given number " + x + " is Odd");
        }
    }

//    public void test1() {
//        if (n % 2 == 0) {
//            System.out.println("The given number " + x + " is Even ");
//        } else {
//            System.out.println("The given number +" x + " is Odd");
//        }
    }

