package homeworkweek7;

import java.util.Scanner;

public class Programme7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salers ID:  ");
        String saler_ID = sc.nextLine();
        System.out.println("Enter salers Name:");
        String saler_name = sc.nextLine();
        System.out.println("Enter the sales Amount: ");
        int sales_amount = sc.nextInt();
        System.out.println("Enter the Basic salary: ");
        int basic_salary = sc.nextInt();
        System.out.println(salescomm(sales_amount));


    }

    public static int salescomm(int a) {
        //int sales;

    int commission;
        if (a >= 50000) {
           commission = ((a * 35 / 100));
        } else if (a >= 30000 && a < 49999) {

            commission = ((a * 20 / 100));
        } else if (a >= 20000 && a < 29999) {

            commission = ((a * 10 / 100));
        } else if (a >= 10000 && a < 19999) {

            commission = ((a * 5 / 100));
        } else
            commission = ((a * 2 / 100));
return commission;
    }
}