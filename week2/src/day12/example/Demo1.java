package day12.example;

public class Demo1 {
    public static void main(String[] args) {
        A t = new T();
        t.test();
    }
}


abstract class A{
    int a;
    static String b;
    final int c = 0;
    {
        int ab;
    }
    static {
        int dd = 66;
        System.out.println("父类加载");
    }

    A(){
        System.out.println("父类");
    }
    public abstract  void test();
}
class T extends A{
    T(){
        System.out.println("子类");
    }
    static {
        System.out.println("子类加载");
    }
    @Override
     public void test() {
        System.out.println("test");
    }
}