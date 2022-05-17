package example;

public class Demo2 {
    public static void main(String[] args) {
        new A();

        new A();
        A AA = new A();
        System.out.println(AA.a);
    }
}
class A{
     int a;
    static {
        System.out.println("example.A");
    }
}
