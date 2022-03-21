package homeworkweek7;

import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Alphabet to enter city name:  ");
        ch = scan.next().charAt(0);
        System.out.println(alphabet(ch));

    }

    public static char alphabet(char ch) {

        switch (ch) {
            case 'a': case'A':
                System.out.println("Ahmedabad");
                break;
            case 'b': case 'B':
                System.out.println("Baroda");
                break;
            case 'c': case 'C':
                System.out.println("Calcutta");
            case 'd': case 'D':
                    System.out.println("Delhi");
            case 'e': case 'E':
                System.out.println("East London");
            case 'f': case 'F':
                System.out.println("Finchley");
                break;
            default:
                System.out.println("Invalid Entry");

        }
        return ch;
    }
}
