package homeworkweek7;

import java.util.Scanner;

public class Programme12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any caracter :  ");
        char ch = scan.next().charAt(0);// To provide three different types fo input
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {//TO Check the validity of alphabet

            System.out.println(ch + " is A ALPHABET.");

        } else if (ch >= '0' && ch <= '9') { // TO CHECK VALIDITY OF DIGIT

            System.out.println(ch + " is A DIGIT.");

        } else {

            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    }

}

