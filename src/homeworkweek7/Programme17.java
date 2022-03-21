package homeworkweek7;

import java.util.Arrays;

public class Programme17 {

    public static void main(String[] args) {

        pam();

    }

    public static void pam() {
        int[] my_array1 = {15, 14, 25, 29, 60, 98, 32, 78, 90};
        String[] my_array2 = {"sam", "van", "car", "truck", "mum"};

        System.out.println("Original numaric array: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array :" + Arrays.toString(my_array1));

        System.out.println("Original string array: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array :" + Arrays.toString(my_array2));

    }
}
