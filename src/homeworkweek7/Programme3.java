package homeworkweek7;

import java.util.Scanner;

public class Programme3 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        String student_name = scan.nextLine();
        System.out.println("Enter the roll number of student: ");
        String roll_number = scan.nextLine();
        System.out.println("Enter the Maths score: ");
        int mathsmark = scan.nextInt();
        System.out.println("Enter the Science score: ");
        int sciencemark = scan.nextInt();
        System.out.println("Enter the English score: ");
        int englishmark = scan.nextInt();

        if (mathsmark < 0 || mathsmark > 100) {
            System.out.println("Invalid input Maths marks, Marks should be between 0 to 100");
        } else if (sciencemark < 0 || sciencemark > 100) {
            System.out.println("Invalid input science marks, Marks should be between 0 to 100");
        } else if (englishmark < 0 || englishmark > 100) {
            System.out.println("Invalid input English marks, Marks should be between 0 to 100");
        } else {
            int total = (mathsmark + sciencemark + englishmark);
            int percentage = (mathsmark + sciencemark + englishmark) * 100 / 300;
            System.out.println("|-------------------------------------------|");
            System.out.println("|              Mark Sheet                   |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|    Name            :   +name              |");
            System.out.println("|    Roll Number     :   +roll_number       | ");
            System.out.println("|-------------------------------------------|");
            System.out.println("|    Subject            :   Marks           |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|    Maths            :                    |");
            System.out.println("|    Science            :                  |");
            System.out.println("|    English            :                  |");
            System.out.println("|total ="                     + total);
            System.out.println("Percentage         ="     + percentage + " %");
            System.out.println("Result             = "       + (passfail(percentage)));
            System.out.println("Grade              ="        + grade(percentage));
            System.out.println("|-------------------------------------------|");
            System.out.println("|-------------------------------------------|");


            System.out.println("total =" + total);
            System.out.println("Percentage =" + percentage + " %");

            System.out.println("Grade =" + grade(percentage));
            System.out.println("Result = " + (passfail(percentage)));

        }


    }

    public static String grade(int a) {
        String grade;
        if (a >= 80) {
            //System.out.println("A+");
            grade = "A+";
        } else if (a >= 60 && a < 80) {
            //System.out.println("A");
            grade = "A";
        } else if (a >= 50 && a < 60) {
            //System.out.println("B");
            grade = "B";
        } else if (a >= 50 && a < 35) {
            //System.out.println("C");
            grade = "C";
        } else if (a >= 35 && a < 50) {
            //System.out.println("Pass");}
            grade = "Pass";
        } else
            //  System.out.println("Fail");
            grade = "Fail";
        return grade;
    }

    public static String passfail(int a) {
        String cre;
        if (a >= 35) {
            cre = "pass";
        } else
            cre = "Fail";
        return cre;

    }
}




