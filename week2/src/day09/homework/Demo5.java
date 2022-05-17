package day09.homework;

public class Demo5 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.call();
        cat.grasp();
        Dog dog = new Dog();
        dog.call();
        dog.guard();
    }
}

class Animals {
    String name;
    int age;

    public void call() {
        System.out.println("我可以叫");
    }
}

class Cat extends Animals {
    String colcor;

    public void grasp() {
        System.out.println("可以抓老鼠");
    }
}

class Dog extends Animals {
    String sex;

    public void guard() {
        System.out.println("可以看门");
    }
}