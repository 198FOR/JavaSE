import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[]  arry = new int[10];
        change(arry);
        System.out.println(Arrays.toString(arry));
    }
    public static void change(int[] arry){
        int m = 0;
        for (int i = 0; i < arry.length; i++) {
            arry[i] = m;
            m++;
        }
    }
}
