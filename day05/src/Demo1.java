import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b);
        //System.out.println("a = " + a);
        //System.out.println("b = " + b);


    }
    public static void method(int a, int b) {
        a *= 2;
        b *= 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
