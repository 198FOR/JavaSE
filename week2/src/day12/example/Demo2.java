package day12.example;

public class Demo2 {
    public static void main(String[] args) {
        Animal a1 = new Bird();
        a1.test();
        Bird b1 = new Bird();
        b1.fly();
        IFly b2 = new Bird();
        b2.flyy();
        b2.fly();
    }
}

abstract class Animal{
    abstract void test();
}
interface IFly{
    int a = 0;
    default void flyy(){
        System.out.println("fffff");
    }
    void fly();
    static void flyyy(){

    }
}

class Bird extends Animal implements IFly{
    @Override
    void test() {
        System.out.println("飞");
    }

    @Override
    public void fly() {
        System.out.println("飞得更高");
    }

    @Override
    public void flyy() {
        System.out.println("FFFF");
    }
}
