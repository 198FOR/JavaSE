public class Demo1 {
    static Cat cat = new Cat();
    Dog dog = new Dog();
    Dog dog2;
    static Dog dog3;

    public static void main(String[] args) {
        System.out.println("hello world!");
        Demo1 d = new Demo1();
    }

    public Demo1() {
        System.out.println("demo");
    }
}

class Cat {
    static Dog dog = new Dog();

    public Cat() {
        System.out.println("cat");
    }
}

class Dog {
    public Dog() {
        System.out.println("dog");
    }
}