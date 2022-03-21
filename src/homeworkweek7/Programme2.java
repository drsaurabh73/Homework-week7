package homeworkweek7;

import java.util.Scanner;

public class Programme2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input the year:  ");
        int year = in.nextInt();

        boolean p = (year % 4) ==0;
        boolean q = (year % 100) !=0;
        boolean r = ((year % 100 == 0) && (year % 400 == 0));
        if (p && (q || r)){
            System.out.println(year + " is a leap year");
        }else
        {
            System.out.println(year + " is not a leap year");
        }

    }
}
