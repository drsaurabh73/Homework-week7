public class Programme20 {

    public static boolean contains(int[] arr, int rad) {
        for (int n : arr) {
            if (rad == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] my_arrays1 = {25, 55, 29, 76, 82};
        System.out.println(contains(my_arrays1, 55));
        System.out.println(contains(my_arrays1, 72));
    }
}
