package homeworkweek7;

import java.util.Scanner;
public class Programme8 {

    public static void main(String[] args) {
        char  x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Alphabet to enter city name:  ");
        x = scan.next().charAt(0);
        Programme8.alpha(x);


    }

    public static char alpha(char x) {
        if (x == 'a') {
            System.out.println("Ahmedabad");
        } else if (x == 'b') {
            System.out.println("Baroda");
        } else if (x == 'c') {
            System.out.println("Calcutta");
        } else if (x == 'd') {
            System.out.println("Delhi");
        } else if (x == 'e') {
            System.out.println("East London");
        } else if (x == 'f') {
            System.out.println("Finchley");
        } else
            System.out.println("Invalid entry");
        return alpha(x);
    }
}




