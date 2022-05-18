package day10.homework;

public class Obj3 extends Obj1 {
    Obj2 ob2 = new Obj2();
    public Obj3(){

        System.out.println("obj3");
    }
    public static void main(String[] args) {
        Obj3 obj3 = new Obj3();
    }
}
class Obj1 {
    Obj2 ob2 = new Obj2();
    public Obj1() {
        System.out.println("Obj1");
    }
}
class Obj2 {
    public Obj2() {
        System.out.println("obj2");
    }
}
