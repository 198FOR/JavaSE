package day12.example;

public class Demo1 {
}

abstract class Ab {
    abstract void eat();
}
interface Ia1{

}
class Dog extends Ab implements Ia1{
    @Override
    void eat() {
        System.out.println("吃饭");
    }
}