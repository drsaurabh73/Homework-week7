package homeworkweek7;

import java.util.Scanner;

public class Programme1 {

    public static void main(String[] args) {
        System.out.println("Java program that tells us that Input number is odd or even");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:  ");
        int num = scan.nextInt();
        Programme1 pak1 = new Programme1();
        pak1.EvenOdd(num);
      /* if (num%2 ==0 )
           System.out.println(num + "is even number");
       else
           System.out.println(num + "is odd number");

       */
//        String Programme1 = (num %2 ==0)? "even" : "odd";
//        System.out.println(num + " is " + Programme1);

    }
        public void EvenOdd(int a) {
         String pak = (a%2 == 0)? "Even number" : "Odd Number";
            System.out.println(pak);
        }

}
