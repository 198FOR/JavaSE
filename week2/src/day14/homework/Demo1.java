package day14.homework;

public class Demo1 {
    public static void main(String[] args) {
     Dog dog = new Dog();
     dog.getAllDog();
    }
}

class Dog {
    String name = "小花";
    int age = 5;

    private class Body {
        String color = "黑白";
    }

    private Body body = new Body();

    public void getAllDog() {
        System.out.println(name + " " + age + " " + body.color);
    }
}


