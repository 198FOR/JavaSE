public class Demo2 {
    public static void main(String[] args) {

        System.out.println(getMax(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 88));


    }

    public static int getMax(int... var) {
        int max = var[0];
        for (int i : var) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
