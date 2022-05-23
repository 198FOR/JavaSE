package day13.example;

import sun.plugin2.gluegen.runtime.CPU;

public class Demo1 {
    public void test(){

    }

    public static void main(String[] args) {
        EnclosedClazz ec = new EnclosedClazz();
        EnclosedClazz.Inner i = ec.new Inner();
        System.out.println(i.a);
        // System.out.println(i.b);

        EnclosedClazz.Inner i2 = new EnclosedClazz().new Inner();
    }
}
class EnclosedClazz {
    int a;
    private int b = 10;
    static int c = 20;
    static final int D = 30;

    //外围类的成员方法
    public void test() {
        //直接创建成员内部类对象
        Inner i = new Inner();
        System.out.println(i.a);
        System.out.println(i.b);

        Inner i2 = this.new Inner();
    }

    public static void testStatic() {
        EnclosedClazz ec = new EnclosedClazz();
        Inner i =ec.new Inner();

        Inner i2 = new EnclosedClazz().new Inner();

    }

    class Inner {
        int a;
        private int b = 100;
        static final int D = 300;

        //成员内部类的成员方法
        void testInner(int b) {
            System.out.println(b);
            System.out.println(this.b);
            System.out.println(EnclosedClazz.this.b);
            System.out.println(EnclosedClazz.this.a);
            System.out.println(a);
            System.out.println(EnclosedClazz.c);
            System.out.println(EnclosedClazz.D);
            System.out.println(Inner.D);
        }

        public Inner() {
            System.out.println(this);
            System.out.println(EnclosedClazz.this);
        }
    }
}
