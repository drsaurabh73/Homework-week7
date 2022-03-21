package homeworkweek7;

public class Programme19 {

    public static void main(String[] args) {
       avgarr();


    }

    public static void avgarr() {
        int[] number = new int[]{15, 19, 22, 27, 30, 55};
        int sum = 0;
        double average = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
            //calculate average value
            average = sum / number.length;


        } System.out.println("Average value of the given number:" + average );
    }
}
